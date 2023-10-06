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
			System.out.println("Código inválido! O valor é menor que 1");
		}
	}

	public void setNomeTipo(String nomeTipo) {
		if (nomeTipo != "" && nomeTipo != null) {
			this.nomeTipo = nomeTipo;
		} else {
			System.out.println("Nome inválido! O valor está vazio");
		}
	}

	public void setFormaVenda(String formaVenda) {
		if (formaVenda != "" && formaVenda != null) {
			this.formaVenda = formaVenda;
		} else {
			System.out.println("Forma de venda inválida! O valor está vazio");
		}
	}

	public static void setQuantTipo(int quantTipo) {
		if (quantTipo > 0) {
			TipoVO.quantTipo = quantTipo;
		} else {
			System.out.println("Quantidade inválida! O valor é menor que 1");
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
