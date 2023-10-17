package br.edu.ufersa.autoestoque.model.BO;

import br.edu.ufersa.autoestoque.model.VO.ProdutoVO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.autoestoque.exception.AtualizarEX;
import br.edu.ufersa.autoestoque.exception.BuscarEX;
import br.edu.ufersa.autoestoque.exception.DeletarEX;
import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.model.DAO.ProdutoDAO;

public class ProdutoBO {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public void inserir(ProdutoVO produto) throws InserirEX {
        try {
            if (produto != null) {
                try{
                    produtoDAO.inserir(produto);
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

    public void deletar(ProdutoVO produto) throws DeletarEX {
        try {
            if (produto != null) {
                try{
                    produtoDAO.deletar(produto);
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

    public void atualizar(ProdutoVO produto) throws AtualizarEX {
        try {
            if (produto != null) {
                try{
                    produtoDAO.atualizar(produto);
                } catch (SQLException e) {
                    throw new AtualizarEX();
                }
            } else {
                throw new AtualizarEX();
            }
        }
        catch (AtualizarEX e) {
            throw new AtualizarEX();
        }
    }

    public ResultSet buscarPorId(ProdutoVO produto) throws BuscarEX {
        try {
            if (produto != null) {
                try{
                    return produtoDAO.buscarPorId(produto);
                } catch (SQLException e) {
                    throw new BuscarEX();
                }
            } else {
                throw new BuscarEX();
            }
        }
        catch (BuscarEX e) {
            throw new BuscarEX();
        }
    }

    public ResultSet listar() throws BuscarEX {
        try {
            try{
                return produtoDAO.listar();
            } catch (SQLException e) {
                throw new BuscarEX();
            }
        }
        catch (BuscarEX e) {
            throw new BuscarEX();
        }
    }
}