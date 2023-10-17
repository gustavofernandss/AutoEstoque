package br.edu.ufersa.autoestoque.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.edu.ufersa.autoestoque.exception.AtualizarEX;
import br.edu.ufersa.autoestoque.exception.BuscarEX;
import br.edu.ufersa.autoestoque.exception.DeletarEX;
import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.exception.InsertException;
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;

public class UsuarioBO implements UsuarioInterBO {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    public void inserir(UsuarioVO usuario) throws InserirEX {
        try {
            if (usuario != null) {
                try {
                    usuarioDAO.inserir(usuario);
                } catch (SQLException e) {
                    throw new InserirEX();
                }
            } else {
                throw new InserirEX();
            }
        } catch (InserirEX e) {
            throw new InserirEX();
        }
    }

    @Override
    public void deletar(UsuarioVO usuario) throws DeletarEX {
        try {
            if (usuario != null) {
                try {
                    usuarioDAO.deletar(usuario);
                } catch (SQLException e) {
                    throw new DeletarEX();
                }
            } else {
                throw new DeletarEX();
            }
        } catch (DeletarEX e) {
            throw new DeletarEX();
        }
    }

    @Override
    public void atualizar(UsuarioVO usuario) throws AtualizarEX {
        try {
            if (usuario != null) {
                try {
                    usuarioDAO.atualizar(usuario);
                } catch (SQLException e) {
                    throw new AtualizarEX();
                }
            } else {
                throw new AtualizarEX();
            }
        } catch (AtualizarEX e) {
            throw new AtualizarEX();
        }
    }

    @Override
    public ResultSet buscarPorId(UsuarioVO usuario) throws BuscarEX {
        try {
            if (usuario != null) {
                try {
                    return usuarioDAO.buscarPorId(usuario);
                } catch (SQLException e) {
                    throw new BuscarEX();
                }
            } else {
                throw new BuscarEX();
            }
        } catch (BuscarEX e) {
            throw new BuscarEX();
        }
    }

    @Override
    public ResultSet buscarPorLogin(UsuarioVO usuario) throws BuscarEX {
        try{
            if (usuario != null) {
                try {
                    return usuarioDAO.buscarPorNome(usuario);
                } catch (SQLException e) {
                    throw new BuscarEX();
                }
            } else {
                throw new BuscarEX();
            }
        } catch (BuscarEX e) {
            throw new BuscarEX();
        }
    }

    @Override
    public ResultSet listar() throws BuscarEX {
        try {
            try {
                return usuarioDAO.listar();
            } catch (SQLException e) {
                throw new BuscarEX();
            }
        } catch (BuscarEX e) {
            throw new BuscarEX();
        }
    }
}
