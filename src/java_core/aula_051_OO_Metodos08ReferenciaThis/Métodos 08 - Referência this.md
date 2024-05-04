# Métodos parte 8 - Referência this
Quando nós vamos executar algo, nós precisamos chamar a nossa variável de referência e quem executa em si, os dados,
estão dentro do objeto `estudante.nome` e etc

Quando nós queremos nos referir a algo que está dentro do meu objeto, nós usamos a palavra `this`, por exemplo
```java
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
```
```java
import java_core.aula_051_OO_Metodos08ReferenciaThis.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("-----------------------");
        estudante02.imprime();
    }
}
```
```text
João
20
M
-----------------------
Maria
15
F
```
Isso só funciona quando estamos dentro do objeto, não é obrigatório usar o `this`, daria pra imprimir apenas passando o
atributo `nome`, `idade` e etc, mas é uma boa prática utilizarmos o this