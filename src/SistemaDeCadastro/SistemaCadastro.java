package SistemaDeCadastro;

public class SistemaCadastro {
    public static void main(String[] args) {

        //Instanciando uma classe pessoa com o construtor!
        Pessoa pessoa1 = new Pessoa("Jackson",
                "12345678910","Rua abc - N:123");

        System.out.println(pessoa1.getNome()+", seu cpf é "+pessoa1.getCpf()+
                ", e o seu endereço é "+pessoa1.getEndereco());

    }
}
