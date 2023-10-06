package br.edu.ufersa.autoestoque.model.VO;

public abstract class UsuarioVO {
    private String nome;
	protected String senha;
	private String CPF;

    // Métodos get
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCPF() {
        return CPF;
    }

    // Métodos set
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser vazio");
        }
    }

    public void setSenha(String senha) {
        if (senha != null && !senha.isEmpty()) {
            this.senha = senha;
        } else {
            System.out.println("A senha não pode ser vazia");
        }
    }

    public void setCPF(String CPF) {
        if (CPF != null && !CPF.isEmpty() && validarCPF(CPF)) {
            this.CPF = CPF;
        } else {
            System.out.println("O CPF é inválido");
        }
    }

    // Métodos toString
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + CPF;
    }

    // Métodos de validação

    public final boolean validarCPF(String CPF) {
        if (CPF.length() != 11) {
            return false;
        }
        
        // Somar os 9 primeiros dígitos do CPF multiplicados por 10, 9, 8, 7, 6, 5, 4, 3, 2
        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Integer.parseInt(CPF.substring(i, i + 1));
        }
        
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += digitos[i] * (10 - i);
        }
        
        // Resto da divisão do resultado por 11
        int resto = soma % 11;
        // Se o resto for menor que 2, o primeiro dígito verificador é 0, senão é 11 menos o resto
        int primeiroDigitoVerificador = resto < 2 ? 0 : 11 - resto;
        
        // Somar os 10 primeiros dígitos do CPF multiplicados por 11, 10, 9, 8, 7, 6, 5, 4, 3, 2
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += digitos[i] * (11 - i);
        }
        
        // Resto da divisão do novo resultado por 11
        resto = soma % 11;
        // Se o resto for menor que 2, o segundo dígito verificador é 0, senão é 11 menos o resto
        int segundoDigitoVerificador = resto < 2 ? 0 : 11 - resto;
        
        // Comparação entre os dígitos verificadores e os dois últimos dígitos do CPF
        return primeiroDigitoVerificador == digitos[9] && segundoDigitoVerificador == digitos[10];
    }
}
