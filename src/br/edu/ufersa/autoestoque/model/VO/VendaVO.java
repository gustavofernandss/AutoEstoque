package br.edu.ufersa.autoestoque.model.VO;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class VendaVO {
    private int idVenda;
    private float valor;
    private OperadorVO operador;
    private ArrayList<ProdutoVO> produtos;  
    private LocalDate dataVenda = LocalDate.now();
    private LocalTime horaVenda = LocalTime.now();

    // Métodos get

    public int getIdVenda() {
        return idVenda;
    }

    public float getValor() {
        return valor;
    }

    public OperadorVO getOperador() {
        return operador;
    }

    public List<ProdutoVO> getProdutos() {
        return produtos;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public LocalTime getHoraVenda() {
        return horaVenda;
    }

    // Métodos set

    public void setValor(float valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("valor inválido");
        }
    }

    public void setOperador(OperadorVO operador) {
        if (operador != null) {  
            this.operador = operador;
        } else {
            throw new IllegalArgumentException("Operador inválido");
        }
    }

    public void setProdutos(ArrayList<ProdutoVO> produtos) {  
        if (produtos != null) {
            this.produtos = produtos;
        } else {
            throw new IllegalArgumentException("Produtos inválidos");
        }
    }

    public void setDataVenda(LocalDate dataVenda) {
        if (dataVenda != null) {
            this.dataVenda = dataVenda;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public void setHoraVenda(LocalTime horaVenda) {
        if (horaVenda != null) {
            this.horaVenda = horaVenda;
        } else {
            throw new IllegalArgumentException("Hora inválida");
        }
    }

    public void setIdVenda(int idVenda) {
        if (idVenda >= 0) {
            this.idVenda = idVenda;
        } else {
            throw new IllegalArgumentException("ID de venda inválido");
        }
    }
}
