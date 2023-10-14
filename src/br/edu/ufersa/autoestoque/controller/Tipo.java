package br.edu.ufersa.autoestoque.controller;

public class Tipo {
	@SuppressWarnings("unused")
	private final int codigoTipo;
	private String nomeTipo;
	private String formaVenda;
	private static int quantTipo;

	@SuppressWarnings("static-access")
	public Tipo(String nomeTipo, String formaVenda) {
		setNomeTipo(nomeTipo);
		setFormaVenda(formaVenda);
		this.codigoTipo = quantTipo;
		this.quantTipo += 1;
	}
	
	// Métodos set
	public void setNomeTipo(String nomeTipo) {
		if (nomeTipo != "") {
			this.nomeTipo = nomeTipo;
		} else {
			System.out.println("Valor inválido! O valor está vazio");
		}
	}

	public void setFormaVenda(String formaVenda) {
		if (formaVenda != "") {
			this.formaVenda = formaVenda;
		} else {
			System.out.println("Valor inválido! O valor está vazio");
		}
	}

	// Métodos get
	public String getNomeTipo() {
		return nomeTipo;
	}

	public String getFormaVenda() {
		return formaVenda;
	}
}
