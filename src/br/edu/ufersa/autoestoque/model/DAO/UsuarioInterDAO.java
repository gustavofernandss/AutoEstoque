package br.edu.ufersa.autoestoque.model.DAO;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UsuarioInterDAO<VO extends UsuarioVO> extends BaseInterDAO<VO> {
    public void inserir(VO usuario) throws SQLException;
    public void atualizar(VO usuario) throws SQLException;
    public void atualizarNome(VO usuario) throws SQLException;
    public void atualizarSenha(VO usuario) throws SQLException;
    public void deletar(VO usuario) throws SQLException;
    public ResultSet buscarPorId(VO usuario) throws SQLException;
    public ResultSet listar() throws SQLException;
    public ResultSet buscarPorNome(VO usuario) throws SQLException;
    public ResultSet buscarPorCpf(VO usuario) throws SQLException;
}
