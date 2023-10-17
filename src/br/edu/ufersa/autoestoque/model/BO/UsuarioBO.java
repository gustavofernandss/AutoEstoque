package br.edu.ufersa.autoestoque.model.BO;

import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;
import br.edu.ufersa.autoestoque.exception.AutenticationException;
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UsuarioBO implements UsuarioInterBO <UsuarioVO>{
	
	
	
	public void cadastrar(UsuarioVO vo) throws Exception {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				throw new Exception("Impossível inserir, pois já existe um usuario com esse login");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public void alterar(UsuarioVO vo) throws Exception {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterar(vo);
			} else {
				throw new Exception("Impossível alterar, pois não existe nenhum usuario com esse login");
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public void remover(UsuarioVO vo) throws Exception {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.remover(vo);
			} else {
				throw new Exception("Impossível remover, pois não existe nenhum usuario com esse login");
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}

	}
	
	public UsuarioVO buscarUsuario(String login) {
		// toDO
		UsuarioVO usuario = new UsuarioVO();

		return usuario;
	}

	public List<UsuarioVO> listar() {
		List<UsuarioVO> usuarios = dao.listar();

		return usuarios;
	}

	@Override
	public UsuarioVO autenticar(UsuarioVO vo) throws AutenticationException {
		// TODO Auto-generated method stub
		return null;
	}




}
