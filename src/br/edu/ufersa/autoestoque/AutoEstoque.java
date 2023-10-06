/*package br.edu.ufersa.autoestoque;
import br.edu.ufersa.autoestoque.controller.*;
import br.edu.ufersa.autoestoque.model.VO.GerenteVO;
import br.edu.ufersa.autoestoque.model.VO.OperadorVO;
import br.edu.ufersa.autoestoque.model.VO.ProdutoVO;
import br.edu.ufersa.autoestoque.model.VO.TipoVO;
import br.edu.ufersa.autoestoque.model.VO.VendaVO;

import java.util.ArrayList;

public class AutoEstoque {
	public static void main(String[] args) {
		TipoVO tipo1 = new TipoVO("Por quantidade", "qtd");
		ProdutoVO produto1 = new ProdutoVO(12222223, "Detergente", "Ypê" , tipo1, "Produto de Limpeza", 4.50f );
		ProdutoVO produto2 = new ProdutoVO(11300000, "Sabão", "Omo" , tipo1, "Produto de Limpeza", 5.50f);
		
		ArrayList<ProdutoVO> produtos = new ArrayList<>();
		produtos.add(produto1);
        produtos.add(produto2);
        
        produto1.acrescentarEstoque(2);
		produto2.acrescentarEstoque(3);
		
		
		OperadorVO operador1 = new OperadorVO("Antonio Silva","minhaSenha", false, 111112);
		GerenteVO gerente1 = new GerenteVO("Joaõ Silva","minhaSenha", true, 111111);
		VendaVO venda1 = new VendaVO(123, operador1, produtos);
	   		   	
	   	venda1.realizarVenda();
	   	venda1.exibirVenda();
	   	
	}

}*/
