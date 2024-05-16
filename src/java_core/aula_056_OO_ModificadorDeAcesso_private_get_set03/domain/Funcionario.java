package java_core.aula_056_OO_ModificadorDeAcesso_private_get_set03.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        System.out.println("--------------------------------");
    }
}
