# Estruturas Condicionais Parte 1 - IF

## Como funciona?
Basicamente a condição IF verifica se o valor é verdadeira ou falso,
caso seja verdadeira, ele executa o código dentro do bloco.
Uma forma mais simples de entender é pensando que o IF significa "se"

Por exemplo

Se o dia estiver ensolarado, eu vou a praia

Traduzindo isso para uma linguagem mais próxima da máquina, seria assim
```text
if(dia estiver ensolarado) {
    eu vou a praia
}
```
Então no caso ele vai analisar, o dia está ensolarado? se sim, então eu vou a praia.
Se o dia não estiver ensolarado, eu não irei a praia

E como mencionado mais acima, o IF ele executa o código apenas dentro do bloco dele.
E como sabemos se o código está dentro do bloco dele?

Todo código que estiver entre as { } do IF, será executado.

Vamos agora jogar para o código Java e ver como ficaria?
```java
public class Aula20EstruturasCondicionais_IF {
    public static void main(String[] args) {
        // Vamos fazer uma verificação para compras de bebida alcólicas
        int idade = 20;
        if(idade >= 18) {
            System.out.println("Pode comprar bebida alcólica");
        }
    }
}
```
Qual seria o resultado do código acima?

Exatamente! o código iria retornar "Pode comprar bebida alcólica"

Mas e se a idade dele fosse menor que 18? Como ficaria?

```java
public class Aula20EstruturasCondicionais_IF {
    public static void main(String[] args) {
        // Vamos fazer uma verificação para compras de bebida alcólicas
        int idade = 16;
        if(idade >= 18) {
            System.out.println("Pode comprar bebida alcólica");
        }
    }
}
```
Isso mesmo, ele não poderá comprar bebida alcólica, já que para comprar ele precisa ter 18 anos ou mais de idade

## Operador de negação ! (NOT)
Ok, até aqui já deu pra entender como funciona a estrutura condicional IF, mas e se quisermos fazer o contrário?

E se quisermos verificar o inverso? por exemplo

```java
public class Aula20EstruturasCondicionais_IF {
    public static void main(String[] args) {
        // Vamos fazer uma verificação para compras de bebida alcólicas
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar bebida alcólica");
        }
    }
}
```
No código acima nós verificamos o contrário, pois o operador de negação inverte a operação

Irei explicar linha por linha do código acima.

A minha idade é 16, e para ser autorizado a comprar bebida alcólica eu preciso ter uma idade maior ou
igual a 18, como a minha idade é menor que 18, eu não estou autorizado a comprar bebida alcólica

Ok, até aqui deu para entender certo? Mas porque nós entramos dentro do IF, se o valor precisa ser true, e
já que minha idade é menor que 18, a variável "isAutorizadoComprarBebida" é falsa, significando que não sou autorizado

Nós conseguimos entrar no bloco do IF através do operador de negação ( ! ). Como eu disse mais acima, ele inverte a operação

Então a minha variável "isAutorizadoComprarBebida" era falsa, porém quando chegou na verificação do IF,
nós invertemos o valor dela utilizando o "!", e já que invertemos, ela deixou de ser false e passou a ser true,
podendo assim o código dentro do IF ser executado