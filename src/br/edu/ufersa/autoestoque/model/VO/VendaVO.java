package br.edu.ufersa.autoestoque.model.VO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufersa.autoestoque.controller.Operador;
import br.edu.ufersa.autoestoque.controller.Produto;

public class VendaVO{

	
	    private int idVenda;
	    private float valor;
	    private Operador operador;
	    private ArrayList<Produto> produtos;  
	    private LocalDate dataVenda = LocalDate.now();
	    private LocalTime horaVenda = LocalTime.now();
		
	    
	    public VendaVO(int idVenda, float valor, Operador operador, ArrayList<Produto> produtos, LocalDate dataVenda,
				LocalTime horaVenda) {
			super();
			this.idVenda = idVenda;
			this.valor = valor;
			this.operador = operador;
			this.produtos = produtos;
			this.dataVenda = dataVenda;
			this.horaVenda = horaVenda;
		}
	    public int getIdVenda() {
	        return idVenda;
	    }

	    public void setIdVenda(int idVenda) {
	        if (idVenda >= 0) {
	            this.idVenda = idVenda;
	        } else {
	            throw new IllegalArgumentException("ID de venda inválido");
	        }
	    }

	    public float getValor() {
	        return valor;
	    }

	    public void setValor(float valor) {
	        if (valor >= 0) {
	            this.valor = valor;
	        } else {
	            throw new IllegalArgumentException("valor inválido");
	        }
	    }

	    public Operador getOperador() {
	        return operador;
	    }

	    public void setOperador(Operador operador) {
	        if (operador != null) {  
	            this.operador = operador;
	        } else {
	            throw new IllegalArgumentException("Operador inválido");
	        }
	    }

	    public List<Produto> getProdutos() {
	        return produtos;
	    }

	    public void setProdutos(ArrayList<Produto> produtos) {  
	        if (produtos != null) {
	            this.produtos = produtos;
	        } else {
	            throw new IllegalArgumentException("Produtos inválidos");
	        }
	    }

	    public LocalDate getDataVenda() {
	        return dataVenda;
	    }

	    public void setDataVenda(LocalDate dataVenda) {
	        if (dataVenda != null) {
	            this.dataVenda = dataVenda;
	        } else {
	            throw new IllegalArgumentException("Data inválida");
	        }
	    }

	    public LocalTime getHoraVenda() {
	        return horaVenda;
	    }

	    public void setHoraVenda(LocalTime horaVenda) {
	        if (horaVenda != null) {
	            this.horaVenda = horaVenda;
	        } else {
	            throw new IllegalArgumentException("Hora inválida");
	        }
	    }
	    
	    
}