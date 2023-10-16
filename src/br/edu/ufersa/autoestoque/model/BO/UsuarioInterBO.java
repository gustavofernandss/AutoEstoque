package br.edu.ufersa.autoestoque.model.BO;

import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;
import java.util.List;

import br.edu.ufersa.autoestoque.exception.AutenticationException;
import br.edu.ufersa.autoestoque.exception.InsertException;

public interface UsuarioInterBO<VO extends UsuarioVO> {
	public void alterar(VO vo) throws InsertException;

	public UsuarioVO autenticar(VO vo) throws AutenticationException;
	
	

}
