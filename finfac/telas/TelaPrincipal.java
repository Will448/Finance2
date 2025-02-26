
package br.com.finfac.telas;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

    private static String perfil;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(String perfil) {
        this.perfil = perfil;
        getContentPane().setBackground(Color.WHITE);
        initComponents();
        TelaPerfil telaperfil = new TelaPerfil();
        if (perfil.equals("admin")) {

            telaperfil.setVisible(true);
            Desktop.add(telaperfil);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadEvento = new javax.swing.JMenuItem();
        menCadGastos = new javax.swing.JMenuItem();
        menCadFamiliares = new javax.swing.JMenuItem();
        menCadReceita = new javax.swing.JMenuItem();
        MenAju = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSai = new javax.swing.JMenuItem();
        MenOpcPerfil = new javax.swing.JMenuItem();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finance");
        setBackground(new java.awt.Color(20, 30, 40));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desktop.setPreferredSize(new java.awt.Dimension(1074, 560));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 42, -1, -1));

        lblData.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblData.setText("Data");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        lblUsuario2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuario2.setText("Usuario");
        getContentPane().add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 8, -1, -1));

        menCad.setText("Cadastro");

        menCadEvento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadEvento.setText("Evento");
        menCadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadEventoActionPerformed(evt);
            }
        });
        menCad.add(menCadEvento);

        menCadGastos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadGastos.setText("Gastos");
        menCadGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadGastosActionPerformed(evt);
            }
        });
        menCad.add(menCadGastos);

        menCadFamiliares.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadFamiliares.setText("Familiares");
        menCadFamiliares.setEnabled(false);
        menCadFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadFamiliaresActionPerformed(evt);
            }
        });
        menCad.add(menCadFamiliares);
        // Adicionando o item Receita ao menu de cadastro
        menCadReceita.setText("Receita");
        menCadReceita.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadReceitaActionPerformed(evt);
            }
        });
        menCad.add(menCadReceita);
        Menu.add(menCad);

        MenAju.setText("Ajuda");

        MenAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenAjuSob.setText("Sobre");
        MenAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuSob);

        Menu.add(MenAju);

        MenOpc.setText("Opções");

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenOpcSai.setText("Sair");
        MenOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSaiActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcSai);

        MenOpcPerfil.setText("Perfil");
        MenOpcPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcPerfilActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcPerfil);

        Menu.add(MenOpc);

        setJMenuBar(Menu);

        setSize(new java.awt.Dimension(1152, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadEventoActionPerformed

        TelaEvento evento = new TelaEvento();

        System.out.println("Tela de Eventos");
        if (!perfil.equals("admin")) {
            evento.cboEventValidado.setEnabled(false);
        }
        evento.setVisible(true);
        Desktop.removeAll();
        Desktop.add(evento);
        // TODO add your handling code here:
    }//GEN-LAST:event_menCadEventoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcSaiActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair da aplicação ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenOpcSaiActionPerformed

    private void MenAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenAjuSobActionPerformed

    private void menCadFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadFamiliaresActionPerformed
        // TODO add your handling code here:
        TelaUsuario usuario = new TelaUsuario();
        System.out.println("Tela de Familiares");
        usuario.setVisible(true);
        Desktop.removeAll();
        Desktop.add(usuario);
    }//GEN-LAST:event_menCadFamiliaresActionPerformed

    private void menCadReceitaActionPerformed(java.awt.event.ActionEvent evt) {
        TelaReceita receita = new TelaReceita();
        System.out.println("Tela de Receita");
        receita.setVisible(true);
        Desktop.removeAll();
        Desktop.add(receita);
    }
    private void menCadGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadGastosActionPerformed
        // TODO add your handling code here:
        TelaGastos telagastos = new TelaGastos();
        System.out.println("Tela de Gastos");
        if (!perfil.equals("admin")) {
            telagastos.cboSituacao.setEnabled(false);
        }
        telagastos.setVisible(true);
        Desktop.removeAll();
        Desktop.add(telagastos);
    }//GEN-LAST:event_menCadGastosActionPerformed

    private void MenOpcPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcPerfilActionPerformed
        // TODO add your handling code here:
        TelaPerfil telaperfil = new TelaPerfil();
        if (perfil.equals("admin")) {
            telaperfil.setVisible(true);
        } else {
            telaperfil.setVisible(false);
        }
        Desktop.removeAll();
        Desktop.add(telaperfil);
    }//GEN-LAST:event_MenOpcPerfilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(perfil).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcPerfil;
    private javax.swing.JMenuItem MenOpcSai;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario2;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadEvento;
    public static javax.swing.JMenuItem menCadFamiliares;
    private javax.swing.JMenuItem menCadGastos;
    private javax.swing.JMenuItem menCadReceita;
    // End of variables declaration//GEN-END:variables
}
