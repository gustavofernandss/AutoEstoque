package br.edu.ufersa.autoestoque.controller;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;

public class FrontController {
	@FXML private TextField email;  
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
	

