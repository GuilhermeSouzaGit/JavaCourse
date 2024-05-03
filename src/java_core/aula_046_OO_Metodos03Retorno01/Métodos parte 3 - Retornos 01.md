# Métodos parte 3 - Retornos parte 1
```java
public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
```
No código acima nós estamos trabalhando com void, então nossos métodos vão ter uma saída mas ainda não é um retorno,
por isso nós colocamos o void ali. E nós vimos que podemos passar parâmetros.

## Criando um método com retorno específico
```java
public double divideDoisNumeros(double num1, double num2) {
    
}
```
Agora no código acima nós estamos criando um método onde o nosso retorno será sempre um valor `double`, porém se
tentarmos executar o código acima, teremos um erro, pois nós estamos fazendo que o nosso método tem que retornar um
valor double, mas não estamos retornando nada.

Para contonar isso é só adicionarmos o código `return 0;`

```java
public double divideDoisNumeros(double num1, double num2) {
    return 0;
}
```

E para executar é
```java
import java_core.aula_046_OO_Metodos03Retorno01.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divideDoisNumeros(20, 2);
    }
}
```
Porém se tentarmos executar, não nos será retornado nada, mas ambos os códigos estão sendo executados.

O retorno de um método é como se estivessmos inicializando uma variável com aquele atributo, então para isso nós precisamos
criar e definir a nossa variável como um `double`

```java
import java_core.aula_046_OO_Metodos03Retorno01.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
```
Porém nosso código não está fazendo a operação que nós passamos como argumentos do nosso método, então vamos voltar
ao nosso método e fazer ele executar corretamente essa operação matemática.
```java
public double divideDoisNumeros(double num1, double num2) {
    return num1 / num2;
}
```
E ao voltarmos no nosso código e executar este método, o valor impresso será `10.0`