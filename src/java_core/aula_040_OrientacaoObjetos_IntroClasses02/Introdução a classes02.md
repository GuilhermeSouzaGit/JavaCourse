# Orientação a objetos - introdução a classes parte 2
Está aula foi apenas para fixar alguns conteúdos e explicar algumas coisas, irei explica-las rapidamente mais abaixo

## Criando objetos sem atribuir a uma variável
O que acontece se criarmos um novo objeto sem associar ele a uma variável? é possível?

Sim, é possível, e simplesmente não acontece nada, apenas é criado um novo espaço em memória onde não podemos acessar
```java
import java_core.aula_039_OrientacaoObjetos_IntroClasses01.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        new Estudante();
    }
}
```
Por isso, para acessarmos os valores dos atributos de um objeto, nós precisamos "linka-los" a uma variável, para assim podermos imprimi-los
```java
import java_core.aula_039_OrientacaoObjetos_IntroClasses01.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante);
    }
}
```

## Imprimindo atributos que não possuem valores
E o que acontece se tentarmos imprimir atributos que não possuem valores dentro deles? por exemplo na aula passada nós utilizamos o 
`estudante.nome = "Guilherme" ` para adicionar um valor para o atributo deste objeto. Mas e se tentarmos imprimir ele sem ter 
adicionado valores dentro dele?, simplesmente ele irá imprimir o valor da inicialização padrão dos tipos dos nossos atributos, 
ou seja, para o atributo `String nome`, ele irá imprimir null, para o atributo `char sexo` irá imprimir ` `, e para a `int idade` o valor `0`
```java
import java_core.aula_039_OrientacaoObjetos_IntroClasses01.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
```
sendo a resposta...
```text
null
0
 
```

## Inicializando atributos com valores padrões
Em vez de deixarmos nossos atributos inicializarem com os valores padrões dos tipos dele, nós também podemos definir
valores padrões para a inicialização dos nossos atributos. Vamos voltar ao nosso objeto `Estudante` para mostrar no código.

```java
public class Estudante {
    public String nome = "Guilherme";
    public int idade;
    public char sexo;
}
```

Agora sempre que imprimirmos o atributo `nome`, ele virá com o valor padrão `"Guilherme"`, e só irá parar de inicializar com este valor,
quando assim como fizemos nas outras vezes, nós atribuirmos um novo valor a ele