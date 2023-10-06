package br.edu.ufersa.autoestoque.model.VO;

public class OperadorVO extends UsuarioVO{
	// Override da senha para exatamente 5 caracteres
	@Override
	public void setSenha(String senha) {
		if(senha.length() == 5){
			this.senha = senha;
		}else{
			System.out.println("A senha deve conter exatamente 5 caracteres");
		}
	}
}
