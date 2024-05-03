# Métodos parte 2 - Parâmetros
Os parâmetros são valores personalizados que nos permitem deixar nossos métodos mais vivos e mais dinâmicos

## Como adicionar parâmetros?
Parâmetros são como variáveis e funcionam apenas localmente, então elas seguem os mesmos padrões quando declaramos
variáveis em outros lugares do código

Um exemplo é nesse nosso código abaixo
```java
public class Calculadora {
    public void multiplicaDoisNumeros() {

    }
}
```
No método multiplicaDoisNumeros, nós precisamos obviamente de 2 números, porém como teremos esses 2 números se ninguém
nos dizer quais são eles. E é aí que entram os parâmetros

Para funcionar nós precisamos de 2 números, e para fazer isso no código, nós devemos escrever assim
```java
public class Calculadora {
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
```
E agora para executar o código.
```java
import java_core.aula_045_OO_Metodos02Parametros.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros();
    }
}
```
Porém se tentarmos executar o código acima, nós iremos receber um erro indicando que nosso método precisa receber 2 
parâmetros, e para executarmos esse método nós precisamos passar os argumentos dele.

Lembre-se: Paramêtros é quando está recebendo, Argumentos são quando estamos enviando

```java
import java_core.aula_045_OO_Metodos02Parametros.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20);
    }
}
```
```text
200
```
