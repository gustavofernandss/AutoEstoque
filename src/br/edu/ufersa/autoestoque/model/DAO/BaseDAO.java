package br.edu.ufersa.autoestoque.model.DAO;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    // Conexão com postgresql
    private static final String URL = "jdbc:postgresql://localhost:5432/autoestoque";
    private static Connection conexao;

    // Usuário e senha
    private static final String user = "postgres";
	private static final String senha = "alunolcc";

    // Método para conectar com o banco de dados
    public static Connection getConnection() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection(URL, user, senha);
        }
        return conexao;
    }

    // Método para fechar a conexão com o banco de dados
    public static void closeConnection() throws SQLException {
        if (conexao != null) {
            conexao.close();
            conexao = null;
        }
    }
}
