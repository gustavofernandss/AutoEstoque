package br.edu.ufersa.autoestoque.model.VO;

public class TipoVO {
	private int codigoTipo;
	private String nomeTipo;
	private String formaVenda;
	private static int quantTipo;
	
	// Métodos set
	public void setCodigoTipo(int codigoTipo) {
		if (codigoTipo > 0) {
			this.codigoTipo = codigoTipo;
		} else {
			throw new IllegalArgumentException("Código inválido! O valor é menor que 1");
		}
	}

	public void setNomeTipo(String nomeTipo) {
		if (nomeTipo != "" && nomeTipo != null) {
			this.nomeTipo = nomeTipo;
		} else {
			throw new IllegalArgumentException("Nome inválido! O valor está vazio");
		}
	}

	public void setFormaVenda(String formaVenda) {
		if (formaVenda != "" && formaVenda != null) {
			this.formaVenda = formaVenda;
		} else {
			throw new IllegalArgumentException("Forma de venda inválida! O valor está vazio");
		}
	}

	public static void setQuantTipo(int quantTipo) {
		if (quantTipo > 0) {
			TipoVO.quantTipo = quantTipo;
		} else {
			throw new IllegalArgumentException("Quantidade inválida! O valor é menor que 1");
		}
	}

	// Métodos get
	public String getNomeTipo() {
		return nomeTipo;
	}

	public String getFormaVenda() {
		return formaVenda;
	}

	public static int getQuantTipo() {
		return quantTipo;
	}

	public int getCodigoTipo() {
		return codigoTipo;
	}

	// Método toString
	@Override
	public String toString() {
		return "TipoVO [codigoTipo=" + codigoTipo + ", nomeTipo=" + nomeTipo + ", formaVenda=" + formaVenda + "]";
	}
}
