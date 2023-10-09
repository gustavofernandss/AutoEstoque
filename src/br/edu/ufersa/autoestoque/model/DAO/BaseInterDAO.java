package br.edu.ufersa.autoestoque.model.dao;
import java.util.List;
import br.edu.ufersa.autoestoque.exception.InsertException;
import br.edu.ufersa.autoestoque.exception.NotFoundException;
import br.edu.ufersa.autoestoque.model.vo.UsuarioVO;

public interface BaseInterDAO {
	public void cadastrar(UsuarioVO vo) throws InsertException;
	public void buscarPorId(UsuarioVO vo) throws NotFoundException;
	public List<UsuarioVO> listar() throws InsertException;
	public void alterar(UsuarioVO vo) throws InsertException;
	public void remover(UsuarioVO vo) throws InsertException;
}
