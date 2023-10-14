package br.edu.ufersa.autoestoque.model.VO;

public class ProdutoVO {
	private String codBarras;
	private TipoVO tipo;
	private String nome;
	private String marca;
	private String categoria;
	private float preco;
	private int estoque;
	private static int quantProdutos;
	
	public void setTipo(TipoVO tipo) {
		this.tipo = tipo;
	}

	public void setCodBarras(String codBarras) {
		// Padrão de barras UPC-E
		if (codBarras.length() == 8) {
			this.codBarras = codBarras;
		} else {
			throw new IllegalArgumentException("Valor inválido! O código UPC-E deve ter 8 dígitos inteiros");
		}
	}

	public void setPreco(float preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new IllegalArgumentException("Valor inválido! O valor deve ser superior a R$0,00");
		}
	}

	public void setEstoque(int estoque) {
		if (estoque >= 0) {
			this.estoque = estoque;
		} else {
			throw new IllegalArgumentException("Valor inválido! A quantidade deve ser superior a 0");
		}
	}
	
	public void setNome(String nome) {
		if (nome != "" && nome != null) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Valor inválido! A string está vazia");
		}
	}

	public void setMarca(String marca) {
		if (nome != "" && nome != null) {
			this.marca = marca;
		} else {
			throw new IllegalArgumentException("Valor inválido! A string está vazia");
		}
	}

	public void setCategoria(String categoria) {
		if (nome != "" && nome != null) {
			this.categoria = categoria;
		} else {
			throw new IllegalArgumentException("Valor inválido! A string está vazia");
		}
	}
	
	public static void setQuantProdutos(int novaQuantProdutos) {
		if (quantProdutos >= 0) {
			quantProdutos = novaQuantProdutos;
		} else {
			throw new IllegalArgumentException("Valor inválido! A quantidade deve ser superior a 0");
		}
	}

	// Métodos get

	public String getNome() {
		return this.nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public TipoVO getTipo() {
		return this.tipo;
	}

	public String getCodBarras() {
		return this.codBarras;
	}

	public float getPreco() {
		return this.preco;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public int getQuantidade() {
		return quantProdutos;
	}

	// Método toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\nMarca: " + marca + "\nCategoria: " + categoria +
		 "\nTipo: " + tipo + "\nCódigo de Barras: " + codBarras + 
		 "\nPreço: R$" + preco + "\nEstoque: " + estoque;
	}
}
