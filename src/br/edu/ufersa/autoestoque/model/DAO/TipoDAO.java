package br.edu.ufersa.autoestoque.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ufersa.autoestoque.model.VO.TipoVO;

public class TipoDAO<VO extends TipoVO> extends BaseDAO<VO>{

    @Override
    public void inserir(VO tipo) throws SQLException {
        String sql = "INSERT INTO Tipos (nome, formaVenda) VALUES (?, ?)";
        PreparedStatement ptst = null;
        ResultSet generatedKeys = null;
        
        try {
            ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ptst.setString(1, tipo.getNomeTipo());
            ptst.setString(2, tipo.getFormaVenda());
            ptst.executeUpdate();
    
            generatedKeys = ptst.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idTipoGerado = generatedKeys.getInt(1);
                tipo.setCodigoTipo(idTipoGerado);
                System.out.println("Registro inserido com id_tipo gerado: " + idTipoGerado);
            } else {
                System.out.println("Erro ao obter o id_tipo gerado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        } finally {
            if (generatedKeys != null) {
                generatedKeys.close();
            }
            closeConnection();
        }
    }

    @Override
    public void atualizar(VO tipo) throws SQLException {
        String sql = "update Tipos set nome = ?, formaVenda = ? where id_tipo = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, tipo.getNomeTipo());
            ptst.setString(2, tipo.getFormaVenda());
            ptst.setInt(3, tipo.getCodigoTipo());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarNome(VO tipo) throws SQLException {
        String sql = "update Tipos set nome = ? where id_tipo = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, tipo.getNomeTipo());
            ptst.setInt(2, tipo.getCodigoTipo());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o nome: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarFormaVenda(VO tipo) throws SQLException {
        String sql = "update Tipos set formaVenda = ? where id_tipo = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, tipo.getFormaVenda());
            ptst.setInt(2, tipo.getCodigoTipo());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a forma de venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void deletar(VO tipo) throws SQLException {
        String sql = "delete from Tipos where id_tipo = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, tipo.getCodigoTipo());
            ptst.executeUpdate();

            TipoVO.setQuantTipo(TipoVO.getQuantTipo() - 1);
        } catch (SQLException e) {
            System.out.println("Erro ao deletar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public ResultSet buscarPorId(VO tipo) throws SQLException {
        String sql = "select * from Tipos where id_tipo = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, tipo.getCodigoTipo());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ID: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    @Override
    public ResultSet listar() throws SQLException {
        String sql = "select * from Tipos";
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
}