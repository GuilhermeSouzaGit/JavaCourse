# Estruturas Condicionais Parte 3 - Operador Ternário

## Como funciona?
Resumidamente, um operador ternário, é um IF e ELSE. E mostrarei abaixo como funciona a sintaxe dele
```text
variável = (condição) ? verdadeiro : falso;
```
E como ele funciona?. Se a condição for verdadeira, ele vai executar a instrução que se encontra antes dos " : ", 
caso a condição seja false, ele irá executar a instrução após os " : "

## E como fica no código?
```java
public class Aula22EstruturasCondicionais_OperadorTernario {
    public static void main(String[] args) {
        int salario = 3800;
        String playstation5 = "Vou comprar um playstation 5";
        String xboxone = "Vou comprar um xboxone";
        // (condição) ? verdadeiro : falso
        String resultado = salario >= 4200 ? playstation5 : xboxone;
        System.out.println(resultado);
    }
}
```
O que o código acima quer nos dizer?, basicamente significa.

Se o salário for maior ou igual a 4200, vou comprar um PlayStation5, senão, vou comprar um XboxOne

## Outra forma de usar o Operador Ternário
Uma outra forma de usar o operador ternário, é se utilizar parecido com o que vimos na aula passada, por exemplo.

`condição ? valor 1 : condição 2 ? valor 2 : valor 3`

Basicamente o que fizemos aqui foi um IF, ELSE IF e ELSE. Essa forma é um pouco mais difícil de entender, dependendo
das operações presentes nisso. Esse tipo de código não é muito recomendado, justamente por dificultar a leitura.