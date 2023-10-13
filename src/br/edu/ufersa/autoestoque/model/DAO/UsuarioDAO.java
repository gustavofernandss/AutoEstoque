package br.edu.ufersa.autoestoque.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;

public class UsuarioDAO<VO extends UsuarioVO> extends BaseDAO<VO> implements UsuarioInterDAO<VO> {

    @Override
    public void inserir(VO usuario) throws SQLException {
        String sql = "insert into Usuarios (CPF, nome, senha) values (?,?,?)";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ptst.setString(1, usuario.getCPF());
            ptst.setString(2, usuario.getNome());
            ptst.setString(3, usuario.getSenha());
            int affectedRows = ptst.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("A inserção falhou, nenhuma linha foi alterada.");
            }
            ResultSet generatedKeys = ptst.getGeneratedKeys();
            if (generatedKeys.next()) {
                usuario.setCPF(generatedKeys.getString(1));
            } else {
                throw new SQLException("A inserção falhou, nenhum CPF foi retornado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void atualizar(VO usuario) throws SQLException {
        String sql = "update Usuarios set nome = ?, senha = ? where CPF = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getNome());
            ptst.setString(2, usuario.getSenha());
            ptst.setString(3, usuario.getCPF());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void atualizarNome(VO usuario) throws SQLException {
        String sql = "update Usuarios set nome = ? where CPF = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getNome());
            ptst.setString(2, usuario.getCPF());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void atualizarSenha(VO usuario) throws SQLException {
        String sql = "update Usuarios set senha = ? where CPF = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getSenha());
            ptst.setString(2, usuario.getCPF());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void deletar(VO usuario) throws SQLException {
        String sql = "delete from Usuarios where CPF = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getCPF());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }    
    }

    @Override
    public ResultSet buscarPorId(VO usuario) throws SQLException {
        String sql = "select * from Usuarios where CPF = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getCPF());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
        return rs;    
    }

    @Override
    public ResultSet listar() throws SQLException {
        String sql = "select * from Usuarios";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao listar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
        return rs;
    }

    @Override
    public ResultSet buscarPorNome(VO usuario) throws SQLException {
        String sql = "select * from Usuarios where nome = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getNome());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
        return rs;
    }

    @Override
    public ResultSet buscarPorCpf(VO usuario) throws SQLException {
        String sql = "select * from Usuarios where CPF = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, usuario.getCPF());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
        return rs;    
    }
    
}
