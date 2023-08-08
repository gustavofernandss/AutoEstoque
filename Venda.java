import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int idVenda;
    private float valor;
    private OperadorCaixa operador;
    private List<Produto> produtos;  // Corrigido o nome da lista para 'produtos'
    private LocalDate dataVenda = LocalDate.now();
    private LocalTime horaVenda = LocalTime.now();

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

    public OperadorCaixa getOperador() {
        return operador;
    }

    public void setOperador(OperadorCaixa operador) {
        if (operador != null) {  // Corrigido o teste de nulidade
            this.operador = operador;
        } else {
            throw new IllegalArgumentException("Operador inválido");
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {  // Corrigido o nome do parâmetro
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
        System.out.println("Venda realizada");
    }

    public void exibirVenda() {
        System.out.println("ID da Venda: " + getIdVenda());
        System.out.println("Valor da Venda: " + getValor());
        System.out.println("Operador: " + getOperador());

        System.out.println("Produtos:");
        for (Produto produto : getProdutos()) {
            System.out.println(produto);
        }

        System.out.println("Data da Venda: " + getDataVenda());
        System.out.println("Hora da Venda: " + getHoraVenda());
    }

    public void removerProduto(Produto produto) {
        System.out.println("Produto removido");
    }

    public void adicionarProduto(Produto produto) {
        System.out.println("Produto adicionado");
    }
}
