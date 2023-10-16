package br.edu.ufersa.autoestoque.model.VO;

import br.edu.ufersa.autoestoque.model.BO.UsuarioBO;
import br.edu.ufersa.autoestoque.model.BO.UsuarioInterBO;
import br.edu.ufersa.autoestoque.exception.AutenticationException;
import br.edu.ufersa.autoestoque.model.BO.GerenteBO;
import br.edu.ufersa.autoestoque.model.BO.ProdutoBO;
import br.edu.ufersa.autoestoque.model.BO.TipoBO;
import br.edu.ufersa.autoestoque.model.BO.VendaBO;
import br.edu.ufersa.autoestoque.model.VO.UsuarioVO;
import br.edu.ufersa.autoestoque.model.VO.GerenteVO;
import br.edu.ufersa.autoestoque.model.VO.OperadorVO;
import br.edu.ufersa.autoestoque.model.VO.ProdutoVO;
import br.edu.ufersa.autoestoque.model.VO.TipoVO;
import br.edu.ufersa.autoestoque.model.VO.VendaVO;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;


public class FrontController {
	
	
//login
	@FXML private TextField login;
	@FXML private TextField senha;
	@FXML private Label erroAut;
//cadastro	
	@FXML private TextField cadLogin;
	@FXML private TextField cadSenha;
	@FXML private TextField cadSenhaConfirm;
	@FXML private TextField cadNome;
	@FXML private Label erroCad;
	UsuarioInterBO<UsuarioVO> usuBO = new UsuarioBO<UsuarioVO>();	

	public void autenticar(ActionEvent event) throws AutenticationException {
		
		UsuarioVO vo = new UsuarioVO();
		
		vo.setNome(login.getText());
		vo.setSenha(senha.getText());
		
		
			try {
				erroAut.setVisible(false);
				UsuarioVO autenticado = usuBO.autenticar(vo);
				if (autenticado instanceof OperadorVO) {
					
				}
				else {
					
				}
					
			
			} catch (AutenticationException e) {
				erroAut.setText("Usuario ou senha invalido");
				erroAut.setVisible(true);
			}
		
	}
	
	  public void logout(ActionEvent event) throws Exception{
		   telaLogin();
	   }
}
