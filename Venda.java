import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private int idVenda;
	private float valor;
	private OperadorCaixa operador;
	private List<Produto> produto;
	private LocalDate dataVenda = LocalDate.now();
	private LocalTime horaVenda = LocalTime.now();
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		if(idVenda >= 0) {
		this.idVenda = idVenda;}
		else {
		throw new IllegalArgumentException("ID de venda inválido");
		}
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if(valor >= 0) {
		this.valor = valor;}
		else {
		throw new IllegalArgumentException("valor inválido");
		
	}
	public OperadorCaixa getOperador() {
		return operador;
	}
	public void setOperador(OperadorCaixa operador) {
		if(operador != 0) {
		this.operador = operador;}
		else {
		throw new IllegalArgumentException("Operador inválido");
		
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		if(produto != 0) {
		this.produto = produto;}
		else {
		throw new IllegalArgumentException("Produto inválido");
		
	}
	public LocalDate getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDate dataVenda) {
		if(produto != 0) {
		this.produto = produto;}
		else {
		throw new IllegalArgumentException("data inválida");
		this.dataVenda = dataVenda;
	}
	public LocalTime getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(LocalTime horaVenda) {
		if(produto != 0) {
		this.produto = produto;}
		else {
		throw new IllegalArgumentException("hora inválido");
		this.horaVenda = horaVenda;
	}

	
	
	public void realizarVenda() {}
	public void exibirVenda() {}
	public void removerProduto(List<Produto> produto) {}
	public void adicionarProduto(List<Produto> produto) {}

	
	//+ realizarVenda()
	//+ exibirVenda() 
	//+ removerProduto(produto[]: Produto) + adicionarProduto(produto[]: Produto)


	
	
}

