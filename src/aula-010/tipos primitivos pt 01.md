# Tipos Primitivos parte 1 - Convenções de variáveis

## Como sabemos que um tipo é um tipo primitivo no Java?

Nós temos 8 tipos primitivos dentro do Java

E são eles: int, double, float, char, byte, short, long, boolean

Todos eles são escritos com letras minúsculas

para se criar uma variável em Java, é necessário informar o tipo dela primeiramente, e depois o nome da sua variável, por exemplo

```java
int idade = 20;
```

Porém até agora nós só iniciamos a variável com um valor, para conseguirmos ver ela no terminal, nós precisamos criar todo o nosso trecho de código e fazer um System.out.println(nome da variável), por exemplo

```java
public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 20;
        System.out.println(age);
    }
}
```

Agora assim que executarmos nosso código, será mostrado a idade no terminal

Ok, mas e se quisermos adicionar uma mensagem? por exemplo: a idade é: (idade), como fazemos?

```java
public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 20;
        System.out.println("A idade é: " + age + " anos");
    }
}
```

Assim que execurtamos, nosso código ficará assim no terminal

A idade é 20 anos
