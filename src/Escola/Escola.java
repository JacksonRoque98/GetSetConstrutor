package Escola;

public class Escola {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Jackson Roque");
        aluno1.setIdade(25);

        System.out.println("O aluno "+aluno1.getNome()+" tem "+aluno1.getIdade()+" anos.");
    }
}
