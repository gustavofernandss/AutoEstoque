package br.edu.ufersa.autoestoque.controller;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class Venda {
    private int idVenda;
    private float valor;
    private Operador operador;
    private ArrayList<Produto> produtos;  
    private LocalDate dataVenda = LocalDate.now();
    private LocalTime horaVenda = LocalTime.now();

    public Venda(int idVenda, Operador operador, ArrayList<Produto> produtos){ // constructor para a classe Venda
    	setIdVenda(idVenda);
    	setOperador(operador);
    	setProdutos(produtos);
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

    public void realizarVenda() {
    	
        System.out.println("Venda realizada com sucesso!");
    }

    public void exibirVenda() {
        System.out.println("ID da Venda: " + getIdVenda());
        System.out.println("Valor da Venda: " + getValor());

        System.out.println("Produtos:");
        for (Produto produto : getProdutos()) {
            System.out.println(produto.getNome());
    }

        System.out.println("Data da Venda: " + getDataVenda());
        System.out.println("Hora da Venda: " + getHoraVenda());
        System.out.println("Caixa responsável: " + getOperador().getNome());
    }

    public void removerProduto(Produto produto) {
        System.out.println("Produto removido");
    }

    public void adicionarProduto(Produto produto) {
        System.out.println("Produto adicionado");
    }
}
