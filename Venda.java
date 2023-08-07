import java.time.LocalDate;
import java.time.LocalTime;

public class Venda {
	
	private int idVenda;
	private float valor;
	private OperadorCaixa operador;
	private Produto produto[];
	private LocalDate dataVenda = LocalDate.now();
	private LocalTime horaVenda = LocalTime.now();
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		if(idVenda >= 0) {
		this.idVenda = idVenda;}
		else {
			System.out.print("Valor invalido");
		}
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public OperadorCaixa getOperador() {
		return operador;
	}
	public void setOperador(OperadorCaixa operador) {
		this.operador = operador;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	public LocalDate getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}
	public LocalTime getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(LocalTime horaVenda) {
		this.horaVenda = horaVenda;
	}

	
	
	public void realizarVenda() {}
	public void exibirVenda() {}
	public void removerProduto(Produto produto[]) {}
	public void adicionarProduto(Produto produto[]) {}

	
	//+ realizarVenda()
	//+ exibirVenda() 
	//+ removerProduto(produto[]: Produto) + adicionarProduto(produto[]: Produto)


	
	
}

