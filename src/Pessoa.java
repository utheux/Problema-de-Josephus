public class Pessoa {
    private int numero;
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
