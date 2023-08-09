package supermercado;


public class Operador {
	private String nome;
	private String senha;
	private boolean isOperador;
	
	public Operador(String nome, String senha, boolean isOperador){
		setNome(nome);
		setSenha(senha);
		this.isOperador = isOperador;
	}
	
	public void setNome(String nome){
		if(nome != null){
			this.nome = nome;
		}else{
			System.out.println("O nome não pode ser vazio");
		}
	}
	
	public void setSenha(String senha){
			if(senha != null){
				this.senha = senha;
			}else{
				System.out.println("A senha não pode ser vazio");
			}
		}
	
	public boolean isOperador(){
		return isOperador;
	}
	
	public boolean autenticar(String nome, String senha){
		return this.nome.equals(nome) && this.senha.equals(senha);
		
	}

	public static void main(String[] args) {
		Operador operador1 = new Operador("Antonio Silva","minhaSenha", false);
		
		String nomeOperador = "Antonio Silva";
        String senhaOperador = "minhaSenha";
        
       	if(operador1.autenticar(nomeOperador, senhaOperador)){
         		System.out.println("Gerente autenticado com sucesso!");
        }else{
            	System.out.println("Autenticação falhou. Verifique o nome e a senha.");
        }
	}

}
