package br.edu.ufersa.autoestoque.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.autoestoque.exception.AtualizarEX;
import br.edu.ufersa.autoestoque.exception.BuscarEX;
import br.edu.ufersa.autoestoque.exception.DeletarEX;
import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.model.DAO.TipoDAO;
import br.edu.ufersa.autoestoque.model.VO.TipoVO;

public class TipoBO {
    private TipoDAO tipoDAO = new TipoDAO();
    
    public void inserir(TipoVO tipo) throws InserirEX{
        try {
            if (tipo != null) {
                try{
                    tipoDAO.inserir(tipo);
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

    public void deletar(TipoVO tipo) throws DeletarEX {
        try {
            if (tipo != null) {
                try{
                    tipoDAO.deletar(tipo);
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

    public void atualizar(TipoVO tipo) throws AtualizarEX {
        try {
            if (tipo != null) {
                try{
                    tipoDAO.atualizar(tipo);
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

    public ResultSet pesquisarPorId(TipoVO tipo) throws BuscarEX {
        try {
            if (tipo != null) {
                try{
                    return tipoDAO.buscarPorId(tipo);
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


}