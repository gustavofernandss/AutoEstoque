package br.edu.ufersa.autoestoque.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.autoestoque.exception.InserirEX;
import br.edu.ufersa.autoestoque.model.DAO.UsuarioDAO;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;

public class UsuarioBO {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

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

    public void deletar(UsuarioVO usuario) throws InserirEX {
        try {
            if (usuario != null) {
                try {
                    usuarioDAO.deletar(usuario);
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

    public void atualizar(UsuarioVO usuario) throws InserirEX {
        try {
            if (usuario != null) {
                try {
                    usuarioDAO.atualizar(usuario);
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

    public ResultSet buscarPorId(UsuarioVO usuario) throws InserirEX {
        try {
            if (usuario != null) {
                try {
                    return usuarioDAO.buscarPorId(usuario);
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

    public ResultSet buscarPorLogin(UsuarioVO usuario) throws InserirEX {
        try {
            if (usuario != null) {
                try {
                    return usuarioDAO.buscarPorNome(usuario);
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
}
