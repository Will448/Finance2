package br.com.finfac.telas;

import br.com.finfac.BD.ModuloConexao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class TelaPerfil extends javax.swing.JInternalFrame {

    Connection conexao = ModuloConexao.conectar();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaPerfil() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        conexao = ModuloConexao.conectar();
        pesquisar_gastosevento();
        pesquisar_receitasevento();
        calcular_totais();
    }

    private void pesquisar_gastosevento() {
        String sql = "SELECT Gastos.valor AS 'Valor', Gastos.descricao AS 'Descrição', Gastos.meiopagamento AS 'Forma de pagamento', Gastos.situacao AS 'Situação', Evento.descricao AS 'Evento', Evento.dataevento AS 'Data do evento', Evento.localevento AS 'Local' "
                + "FROM tbgastosevento AS Gastos "
                + "INNER JOIN tbeventos AS Evento ON (Gastos.id_evento = Evento.id_evento) "
                + "WHERE Gastos.valor LIKE ? "
                + "ORDER BY Gastos.situacao";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisar.getText() + "%");
            rs = pst.executeQuery();
            tblGastos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void pesquisar_receitasevento() {
        String sql = "SELECT Receitas.valor AS 'Valor', Receitas.descricao AS 'Descrição', Receitas.meiopagamento AS 'Forma de pagamento', Receitas.situacao AS 'Situação', Evento.descricao AS 'Evento', Evento.dataevento AS 'Data do evento', Evento.localevento AS 'Local' "
                + "FROM tbreceitasevento AS Receitas "
                + "INNER JOIN tbeventos AS Evento ON (Receitas.id_evento = Evento.id_evento) "
                + "WHERE Receitas.valor LIKE ? "
                + "ORDER BY Receitas.situacao";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisar.getText() + "%");
            rs = pst.executeQuery();
            tblReceitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void calcular_totais() {
        calcular_total_gastos();
        calcular_total_receitas();
    }

    private void calcular_total_gastos() {
        String sql = "SELECT SUM(valor) AS total FROM tbgastosevento";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                lblTotalGastos.setText("Total de Gastos: R$ " + rs.getString("total"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void calcular_total_receitas() {
        String sql = "SELECT SUM(valor) AS total FROM tbreceitasevento";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                lblTotalReceitas.setText("Total de Receitas: R$ " + rs.getString("total"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGastos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceitas = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTotalGastos = new javax.swing.JLabel();
        lblTotalReceitas = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela de Administração");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGastos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {}
        ));
        jScrollPane1.setViewportView(tblGastos);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 500, 200));

        tblReceitas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {}
        ));
        jScrollPane2.setViewportView(tblReceitas);
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 500, 200));

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, -1));

        jLabel1.setText("Pesquisar por valor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        lblTotalGastos.setText("Total de Gastos: R$ 0.00");
        getContentPane().add(lblTotalGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblTotalReceitas.setText("Total de Receitas: R$ 0.00");
        getContentPane().add(lblTotalReceitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        setBounds(0, 0, 1100, 400);
    }

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {
        pesquisar_gastosevento();
        pesquisar_receitasevento();
        calcular_totais();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGastos;
    private javax.swing.JTable tblReceitas;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JLabel lblTotalGastos;
    private javax.swing.JLabel lblTotalReceitas;
}