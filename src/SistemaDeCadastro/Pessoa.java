package SistemaDeCadastro;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //CRIANDO UM CONSTRUTOR
    public Pessoa(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String newEndereco){
        this.endereco = newEndereco;
    }
}
