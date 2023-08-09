package poo;

import java.util.ArrayList;
import java.util.List;

public class AutoEstoque {

	public static void main(String[] args) {
		Tipo tipo1 = new Tipo("Por quantidade", "qtd");
		Produto produto1 = new Produto(12222223, "Detergente", "Ypê" , tipo1, "Produto de Limpeza", 4.50f );
		Produto produto2 = new Produto(11300000, "Sabão", "Omo" , tipo1, "Produto de Limpeza", 5.50f);
		
		
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
        produtos.add(produto2);
        
        produto1.acrescentarEstoque(2);
		produto2.acrescentarEstoque(3);
		
		
		Operador operador1 = new Operador("Antonio Silva","minhaSenha", false, 111112);
		Gerente gerente1 = new Gerente("Joaõ Silva","minhaSenha", true, 111111);
		Venda venda1 = new Venda(123, operador1, produtos);
	   		   	
	   	venda1.realizarVenda();
	   	venda1.exibirVenda();
	   	
	}

}
