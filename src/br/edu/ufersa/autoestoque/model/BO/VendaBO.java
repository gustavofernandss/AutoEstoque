package br.edu.ufersa.autoestoque.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.autoestoque.exception.DeletarEX;
import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.model.DAO.VendaDAO;
import br.edu.ufersa.autoestoque.model.VO.VendaVO;

public class VendaBO{
	private VendaDAO vendaDAO = new VendaDAO();

    public void vender(VendaVO venda) throws InserirEX {
        try {
            if (venda != null) {
                try{
                    vendaDAO.inserir(venda);
                } catch (SQLException e) {
                    throw new InserirEX();
                }
            } else {
                throw new InserirEX();
            }
        }
        catch (InserirEX e) {
            throw new InserirEX();
        }
    }

    public void cancelarVenda(VendaVO venda) throws DeletarEX {
        try {
            if (venda != null) {
                try{
                    vendaDAO.deletar(venda);
                } catch (SQLException e) {
                    throw new DeletarEX();
                }
            } else {
                throw new DeletarEX();
            }
        }
        catch (DeletarEX e) {
            throw new DeletarEX();
        }
    }

    public void atualizar(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    vendaDAO.atualizar(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao atualizar venda!");
                }
            } else {
                throw new SQLException("Erro ao atualizar venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao atualizar venda!");
        }
    }

    public void atualizarProdutosVenda(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    vendaDAO.atualizarProdutosVenda(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao atualizar produtos da venda!");
                }
            } else {
                throw new SQLException("Erro ao atualizar produtos da venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao atualizar produtos da venda!");
        }
    }

    public ResultSet buscarPorId(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    return vendaDAO.buscarPorId(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao buscar venda!");
                }
            } else {
                throw new SQLException("Erro ao buscar venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao buscar venda!");
        }
    }

    public ResultSet buscarProdutosVenda(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    return vendaDAO.buscarProdutosVenda(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao buscar produtos da venda!");
                }
            } else {
                throw new SQLException("Erro ao buscar produtos da venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos da venda!");
        }
    }

    public ResultSet listarVendas() throws SQLException {
        try {
            try{
                return vendaDAO.listar();
            } catch (SQLException e) {
                throw new SQLException("Erro ao listar vendas!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao listar vendas!");
        }
    }

    public ResultSet listarProdutosVendidos() throws SQLException {
        try {
            try{
                return vendaDAO.listarProdutosVendidos();
            } catch (SQLException e) {
                throw new SQLException("Erro ao listar produtos da venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao listar produtos da venda!");
        }
    }

    public ResultSet listarPorData(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    return vendaDAO.listarPorData(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao listar vendas por data!");
                }
            } else {
                throw new SQLException("Erro ao listar vendas por data!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao listar vendas por data!");
        }
    }

    public ResultSet listarProdutosVenda(VendaVO venda) throws SQLException {
        try {
            if (venda != null) {
                try{
                    return vendaDAO.listarProdutosVenda(venda);
                } catch (SQLException e) {
                    throw new SQLException("Erro ao listar produtos da venda!");
                }
            } else {
                throw new SQLException("Erro ao listar produtos da venda!");
            }
        }
        catch (SQLException e) {
            throw new SQLException("Erro ao listar produtos da venda!");
        }
    }
}