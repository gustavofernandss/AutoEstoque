package br.edu.ufersa.autoestoque.model.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface BaseInterDAO<VO> {
    public void inserir(VO entity) throws SQLException; 
    public void atualizar(VO entity) throws SQLException;
    public void deletar(VO entity) throws SQLException;
    public ResultSet buscarPorId(VO entity) throws SQLException;
    public ResultSet listar() throws SQLException;
}
