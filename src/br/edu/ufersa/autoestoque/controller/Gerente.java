package br.edu.ufersa.autoestoque.controller;

public class Gerente {
	private String nome;
	private String senha;
	private int idGerente;
	private boolean isGerente;
	
	public Gerente(String nome, String senha, boolean isGerente, int idGerente){
		setNome(nome);
		setSenha(senha);
		setIsGerente(isGerente);
		setIdGerente(idGerente);
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
	
	
	
	public int getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setIsGerente(boolean isGerente) {
		this.isGerente = isGerente;
	}

	public boolean getIsGerente(){
		return isGerente;
	}
	
	public boolean autenticar(String nome, String senha){
		return this.nome.equals(nome) && this.senha.equals(senha);
		

		
		
	}
		

}
