
// Projeto Suepermercado - Gerente
public class Gerente {
	private String nome;
	private String senha;
	private boolean isGerente;
	
	public Gerente(String nome, String senha, boolean isGerente){
		setNome(nome);
		setSenha(senha);
		this.isGerente = isGerente;
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
	
	public boolean isGerente(){
		return isGerente;
	}
	
	public boolean autenticar(String nome, String senha){
		return this.nome.equals(nome) && this.senha.equals(senha);
		

		
		
	}
		

}
