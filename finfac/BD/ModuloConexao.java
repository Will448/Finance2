
package br.com.finfac.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {


    private static Connection conexao = null;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/finance";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    private ModuloConexao() {
    }


    public static Connection conectar() {
        if (conexao == null) {
            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conectado com o BD");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            }
        }
        return conexao;
    }


    public static void desconectar() {
        if (conexao != null) {
            try {
                conexao.close();
                conexao = null;
                System.out.println("Conexão encerrada.");
            } catch (SQLException e) {
                System.out.println("Erro ao encerrar a conexão: " + e.getMessage());
            }
        }
    }
}

