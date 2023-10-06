package br.edu.ufersa.autoestoque.model.VO;

public class GerenteVO extends UsuarioVO{
	// Override da senha para maior ou igual a 10 caracteres
	@Override
	public void setSenha(String senha) {
		if(senha.length() >= 10){
			this.senha = senha;
		}else{
			System.out.println("A senha deve conter pelo menos 10 caracteres");
		}
	}
}
