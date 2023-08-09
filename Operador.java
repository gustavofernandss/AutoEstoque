public class Operador {
	
	private String nome;
	private String senha;
	private boolean isGerente;
	private int idOperador;
	
	public Operador(String nome, String senha, boolean isGerente, int idOperador){
		setNome(nome); 
		setSenha(senha);
		setIsGerente(isGerente);
		setIdOperador(idOperador);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		if(nome != null){
			this.nome = nome;
		}else{
			System.out.println("O nome não pode ser vazio");
		}
	}
	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha){
			if(senha != null){
				this.senha = senha;
			}else{
				System.out.println("A senha não pode ser vazio");
			}
		}
	
	
	public boolean getIsGerente() {
		return isGerente;
	}


	public void setIsGerente(boolean isGerente) {
		this.isGerente = isGerente;
	}


	public int getIdOperador() {
		return idOperador;
	}


	public void setIdOperador(int idGerente) {
		this.idOperador = idGerente;
	}

	public boolean autenticar(String nome, String senha){
		return this.nome.equals(nome) && this.senha.equals(senha);
		
	}


}
