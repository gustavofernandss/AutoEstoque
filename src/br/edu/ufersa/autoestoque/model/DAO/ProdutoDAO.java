package br.edu.ufersa.autoestoque.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.ufersa.autoestoque.model.VO.ProdutoVO;

public class ProdutoDAO<VO extends ProdutoVO> extends BaseDAO<VO> {

    @Override
    public void inserir(VO produto) throws SQLException {
        String sql = "insert into Produtos (cod_barras, nome, marca, categoria, id_tipo, preco, estoque) values (?,?,?,?,?,?,?)";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getCodBarras());
            ptst.setString(2, produto.getNome());
            ptst.setString(3, produto.getMarca());
            ptst.setString(4, produto.getCategoria());
            ptst.setInt(5, produto.getTipo().getCodigoTipo());
            ptst.setDouble(6, produto.getPreco());
            ptst.setInt(7, produto.getEstoque());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void atualizar(VO produto) throws SQLException {
        String sql = "update Produtos set nome = ?, marca = ?, categoria = ?, id_tipo = ?, preco = ?, estoque = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getNome());
            ptst.setString(2, produto.getMarca());
            ptst.setString(3, produto.getCategoria());
            ptst.setInt(4, produto.getTipo().getCodigoTipo());
            ptst.setDouble(5, produto.getPreco());
            ptst.setInt(6, produto.getEstoque());
            ptst.setString(7, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    // Atualizar cada atributo
    public void atualizarNome(VO produto) throws SQLException {
        String sql = "update Produtos set nome = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getNome());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o nome: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarMarca(VO produto) throws SQLException {
        String sql = "update Produtos set marca = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getMarca());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a marca: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarCategoria(VO produto) throws SQLException {
        String sql = "update Produtos set categoria = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getCategoria());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a categoria: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarTipo(VO produto) throws SQLException {
        String sql = "update Produtos set id_tipo = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, produto.getTipo().getCodigoTipo());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o tipo: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarPreco(VO produto) throws SQLException {
        String sql = "update Produtos set preco = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDouble(1, produto.getPreco());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o preço: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarEstoque(VO produto) throws SQLException {
        String sql = "update Produtos set estoque = ? where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, produto.getEstoque());
            ptst.setString(2, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o estoque: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void deletar(VO produto) throws SQLException {
        String sql = "delete from Produtos where cod_barras = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getCodBarras());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar dados: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public ResultSet buscarPorId(VO produto) throws SQLException {
        String sql = "select * from Produtos where cod_barras = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, produto.getCodBarras());
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
        String sql = "select * from Produtos";
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