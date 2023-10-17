package br.edu.ufersa.autoestoque.model.BO;

import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;

import java.sql.ResultSet;
import java.util.List;

import br.edu.ufersa.autoestoque.exception.AtualizarEX;
import br.edu.ufersa.autoestoque.exception.AutenticationException;
import br.edu.ufersa.autoestoque.exception.BuscarEX;
import br.edu.ufersa.autoestoque.exception.DeletarEX;
import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.exception.InsertException;

public interface UsuarioInterBO<VO extends UsuarioVO> {
	public void inserir(VO usuario) throws InserirEX;

	public void deletar(VO usuario) throws DeletarEX;

	public void atualizar(VO usuario) throws AtualizarEX;

	public ResultSet listar() throws BuscarEX;

	public ResultSet buscarPorId(VO id) throws BuscarEX;

	public ResultSet buscarPorLogin(VO nome) throws BuscarEX;
}
