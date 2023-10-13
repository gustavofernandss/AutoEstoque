package br.edu.ufersa.autoestoque;

// Teste do UsuarioDAO
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;
import br.edu.ufersa.autoestoque.model.VO.GerenteVO;
// Listagem
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoEstoque {
	public static void main(String[] args) {
		UsuarioDAO<UsuarioVO> usuarioDAO = new UsuarioDAO<UsuarioVO>();
		UsuarioVO usuario = new GerenteVO();
		usuario.setCPF("07140535469");
		usuario.setNome("Fulano");
		usuario.setSenha("0123456789");

		// Inserir gerente
		try {
			usuarioDAO.inserir(usuario);
			System.out.println("Usuário inserido com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao inserir usuário: " + e.getMessage());
		}

		// Listar usuários
		try {
			ResultSet rs = usuarioDAO.listar();
			while (rs.next()) {
				System.out.println("CPF: " + rs.getString("CPF"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Senha: " + rs.getString("senha"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar usuários: " + e.getMessage());
		}

		// Atualizar usuário
		try {
			usuario.setNome("Ciclano");
			usuario.setSenha("9876543210");
			usuarioDAO.atualizar(usuario);
			System.out.println("Usuário atualizado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao atualizar usuário: " + e.getMessage());
		}

		// Listar usuario por CPF
		try {
			ResultSet rs = usuarioDAO.buscarPorId(usuario);
			while (rs.next()) {
				System.out.println("CPF: " + rs.getString("CPF"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Senha: " + rs.getString("senha"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar usuário por CPF: " + e.getMessage());
		}

		// Deletar usuário
		try {
			usuarioDAO.deletar(usuario);
			System.out.println("Usuário deletado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao deletar usuário: " + e.getMessage());
		}

		System.out.println("");

		// Listar usuários
		try {
			ResultSet rs = usuarioDAO.listar();
			while (rs.next()) {
				System.out.println("CPF: " + rs.getString("CPF"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Senha: " + rs.getString("senha"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar usuários: " + e.getMessage());
		}
	}
}
