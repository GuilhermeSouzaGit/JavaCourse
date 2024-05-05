# Métodos parte 9 - Varargs
Varargs é um tipo de passagem de parâmetros, ele basicamente é igual ao array, porém com algumas diferenças

Um array comum é utilizado assim
```java
public void somaArray(int[] numeros) {
    int soma = 0;
    for (int i : numeros) {
        soma += i;
    }
    System.out.println(soma);
}
```
```java
import java_core.aula_052_OO_Metodos09Varargs.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
    }
}
```
```text
15
```
Porém com `Varargs` é diferente, onde o que vai mudar é na hora da chamada, e quando chamamos um varargs, ele logo
em seguida é convertido para array
```java
public void somaVarArgs(int... numeros) {
    int soma = 0;
    for (int i : numeros) {
        soma += i;
    }
    System.out.println(soma);
}
```
```java
import java_core.aula_052_OO_Metodos09Varargs.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaVarArgs(1 , 2, 3, 4, 5);
    }
}
```
Este código basicamente está funcionando da mesma forma, e o resultado impresso é o mesmo, onde o que muda é a sintaxe
do código, deste jeito fica mais fácil a passagem de vários elementos do mesmo tipo no método.

OBS: O var args precisa ser o último atribudo a ser passado, por exemplo
```java
public void somaVarArgs(double valor, int... numeros) {
    int soma = 0;
    for (int i : numeros) {
        soma += i;
    }
    System.out.println(soma);
}
```