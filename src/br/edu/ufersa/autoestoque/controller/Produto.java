package br.edu.ufersa.autoestoque.controller;

public class Produto {
	private final int idProd;
	private Tipo tipo;
	private int codBarras;
	private String nome;
	private String marca;
	private String categoria;
	private float preco;
	private int estoque;
	private static int quantProdutos;

	@SuppressWarnings("static-access")
	public Produto(int codBarras, String nome, String marca, Tipo tipo, String categoria, float preco) {
		setCodBarras(codBarras);
		setNome(nome);
		setMarca(marca);
		setTipo(tipo);
		setCategoria(categoria);
		setPreco(preco);
		setEstoque(0);
		this.idProd = quantProdutos;
		this.quantProdutos += 1;
	}

	public void acrescentarEstoque(int quantidade) {
		if (quantidade > 0) {
			this.estoque += quantidade;
		} else {
			System.out.println("Valor inválido! A quantidade deve ser superior a 0");
		}
	}
	
	public void diminuirEstoque(int quantidade) {
		if (quantidade > 0) {
			this.estoque -= quantidade;
		} else {
			System.out.println("Valor inválido! A quantidade deve ser superior a 0");
		}
	}

	// Métodos get
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void setCodBarras(int codBarras) {
		// UPC-E
		int codeLenght = String.valueOf(codBarras).length();
		if (codeLenght == 8) {
			this.codBarras = codBarras;
		} else {
			System.out.println("Valor inválido! O código UPC-E deve ter 8 dígitos inteiros");
		}
	}

	public void setPreco(float preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Valor inválido! O valor deve ser superior a R$0,00");
		}
	}

	public void setEstoque(int estoque) {
		if (estoque >= 0) {
			this.estoque = estoque;
		} else {
			System.out.println("Valor inválido! A quantidade deve ser superior a 0");
		}
	}
	
	public void setNome(String nome) {
		if (nome != "") {
			this.nome = nome;
		} else {
			System.out.println("Valor inválido! A string está vazia");
		}
	}

	public void setMarca(String marca) {
		if (nome != "") {
			this.marca = marca;
		} else {
			System.out.println("Valor inválido! A string está vazia");
		}
	}

	public void setCategoria(String categoria) {
		if (nome != "") {
			this.categoria = categoria;
		} else {
			System.out.println("Valor inválido! A string está vazia");
		}
	}
	
	// Métodos get
	public String getNome() {
		return this.nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getCategaria() {
		return this.categoria;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public int getCodBarras() {
		return this.codBarras;
	}

	public float getPreco() {
		return this.preco;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public int getIdProd() {
		return idProd;
	}
}
