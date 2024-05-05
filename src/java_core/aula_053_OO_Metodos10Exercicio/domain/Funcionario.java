package java_core.aula_053_OO_Metodos10Exercicio.domain;

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
