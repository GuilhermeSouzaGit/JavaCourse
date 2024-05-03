# Orientação a objetos - métodos parte 1
Nessa aula nós falaremos dos comportamentos das classes ou também chamados de, métodos

## Diferença de método e atributos
Nos métodos nós ainda precisamos do modificador de acesso, a primeira parte do método sempre vai ser um modificador 
de acesso e a segunda parte vai ser o retorno, onde um método pode retornar algo como pode também não retornar nada, 
Diferentemente da saída de dados.

E para não retornar nada no Java, nós podemos utilizar o void que significa que o nosso método terá um retorno vazio.

Em seguida nós temos o nome do método, onde ele segue uma convenção que se tiver apenas uma palavra é tudo 
minúsculo, mas se tiver mais de uma palavra a primeira letra dessas palavras serão maiúsculas. 
Logo em seguida abre e fecha parêntese, e abre chaves e fecha chaves, e com isso nós temos nosso método em Java

```java
public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
}
```
e para executar
```java
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
    }
}
```
A diferença é que nos atributos nós utilizamos o sinal de `=`, para atribuir um valor a uma variável, e nós métodos nós
colocamos `.` e o nome do método, seguido dos `()` para executar

Agora vamos criar outro método.
```java
public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    
    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }
}
```
E vamos executa-lo
```java
import java_core.aula_044_OO_Metodos01.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
    }
}
```
```text
20
10
```