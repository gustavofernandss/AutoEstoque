package br.edu.ufersa.autoestoque.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.PreparedStatement;

import br.edu.ufersa.autoestoque.model.VO.VendaVO;

public class VendaDAO<VO extends VendaVO> extends BaseDAO<VO>{

    @Override
    public void inserir(VO venda) throws SQLException {
        String sql = "insert into Vendas (id_venda, valor, data_venda, hora_venda, cpf_usuario) values (?,?,?,?,?)";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, venda.getIdVenda());
            ptst.setDouble(2, venda.getValor());
            ptst.setDate(3, java.sql.Date.valueOf(venda.getDataVenda()));
            ptst.setTime(4, Time.valueOf(venda.getHoraVenda()));
            ptst.setString(5, venda.getOperador().getCPF());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        } finally {
            closeConnection();
        }

        // Pegar a lista de produtos da venda e inserir na tabela produtos_venda
        sql = "insert into produtos_venda (id_venda, id_produto) values (?,?)";
        try {
            ptst = getConnection().prepareStatement(sql);
            for (int i = 0; i < venda.getProdutos().size(); i++) {
                ptst.setInt(1, venda.getIdVenda());
                ptst.setString(2, venda.getProdutos().get(i).getCodBarras());
                ptst.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produtos da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void atualizar(VO venda) throws SQLException {
        String sql = "update Vendas set valor = ?, data_venda = ?, hora_venda = ?, cpf_usuario = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDouble(1, venda.getValor());
            ptst.setDate(2, java.sql.Date.valueOf(venda.getDataVenda()));
            ptst.setTime(3, Time.valueOf(venda.getHoraVenda()));
            ptst.setString(4, venda.getOperador().getCPF());
            ptst.setInt(5, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    // Atualizar a tabela produtos_venda
    public void atualizarProdutosVenda(VO venda) throws SQLException {
        String sql = "update produtos_venda set id_produto = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            for (int i = 0; i < venda.getProdutos().size(); i++) {
                ptst.setString(1, venda.getProdutos().get(i).getCodBarras());
                ptst.setInt(2, venda.getIdVenda());
                ptst.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produtos da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    // Atualizar cada atributo das vendas
    public void atualizarValor(VO venda) throws SQLException {
        String sql = "update Vendas set valor = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDouble(1, venda.getValor());
            ptst.setInt(2, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar valor da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarDataVenda(VO venda) throws SQLException {
        String sql = "update Vendas set data_venda = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDate(1, java.sql.Date.valueOf(venda.getDataVenda()));
            ptst.setInt(2, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar data da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarHoraVenda(VO venda) throws SQLException {
        String sql = "update Vendas set hora_venda = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setTime(1, Time.valueOf(venda.getHoraVenda()));
            ptst.setInt(2, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar hora da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void atualizarOperador(VO venda) throws SQLException {
        String sql = "update Vendas set cpf_usuario = ? where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setString(1, venda.getOperador().getCPF());
            ptst.setInt(2, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar operador da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    // Deletar a venda e os produtos da venda

    @Override
    public void deletar(VO venda) throws SQLException {
        String sql = "delete from Vendas where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public void deletarProdutosVenda(VO venda) throws SQLException {
        String sql = "delete from produtos_venda where id_venda = ?";
        PreparedStatement ptst;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, venda.getIdVenda());
            ptst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar produtos da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    // Buscar a venda e os produtos da venda

    @Override
    public ResultSet buscarPorId(VO venda) throws SQLException {
        String sql = "select * from Vendas where id_venda = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, venda.getIdVenda());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar venda: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    public ResultSet buscarProdutosVenda(VO venda) throws SQLException {
        String sql = "select * from produtos_venda where id_venda = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setInt(1, venda.getIdVenda());
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar produtos da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    // Listar as vendas e os produtos da venda

    @Override
    public ResultSet listar() throws SQLException {
        String sql = "select * from Vendas";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao listar vendas: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    public ResultSet listarProdutosVendidos() throws SQLException {
        String sql = "select * from produtos_venda";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos vendidos: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    // Listar as vendas por data

    public ResultSet listarPorData(VO venda) throws SQLException {
        String sql = "select * from Vendas where data_venda = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDate(1, java.sql.Date.valueOf(venda.getDataVenda()));
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao listar vendas por data: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }

    // Listar produtos de uma venda

    public ResultSet listarProdutosVenda(VO venda) throws SQLException {
        String sql = "select * from produtos_venda where id_venda = ?";
        PreparedStatement ptst;
        ResultSet rs = null;

        try {
            ptst = getConnection().prepareStatement(sql);
            ptst.setDate(1, java.sql.Date.valueOf(venda.getDataVenda()));
            rs = ptst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos da venda: " + e.getMessage());
        } finally {
            closeConnection();
        }

        return rs;
    }
}