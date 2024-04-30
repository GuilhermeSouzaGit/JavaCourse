# Operadores Aritiméticos parte 1

Como bem sabemos os operadores aritiméticos que temos são
- Soma ( + )
- Subtração ( - )
- Multiplicação ( * )
- Divisão ( / )

Ao tentarmos fazer uma operação matemática como essa
```java
public class Aula015OperadoresAritimeticos01 {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int num1 = 10;
        int num2 = 20;
        System.out.println(num2 + num1);
    }
}
```

O resultado impresso será: 30

Mas e se quisermos colocar uma string antes, por exemplo...

"O valor é 30"

Como ficaria no código?

```java
public class Aula015OperadoresAritimeticos01 {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int num1 = 10;
        int num2 = 20;
        System.out.println("O valor é " + num2 + num1);
    }
}
```

E o que será impresso será "O valor é 30" certo?

Errado, quando nós fazemos esse tipo de operação, 
automaticamente o Java entende o sinal de + que está na
frente da string, como uma concatenação

Logo, o que será impresso será: 

"O valor é 2010"

Porque não foi feita nenhuma operação, apenas concatenou

Se nós quisermos imprimir uma string e o valor de uma operação aritimética
que fizemos, podemos fazer deste jeito

```java
public class Aula015OperadoresAritimeticos01 {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 + num2;
        System.out.println("O valor é " + resultado);
    }
}
```
O que será impresso será:

"O valor é 30"

## E se quisermos fazer uma divisão de um número menor? por exemplo

```java
public class Aula015OperadoresAritimeticos01 {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 / num2;
        System.out.println("O valor é " + resultado);
    }
}
```

Todos sabemos que 10 dividido por 20 é igual a 0.5, mas como aqui se trata de uma
linguagem de programação, precisamos explicar para o computador o que nós queremos exatamente

Ao tentar fazer o cálculo acima, o valor impresso será 0, mas porque?

Como nós definimos nossos números e resultado como um INT (Inteiro), o resultado
sempre será forçado para um valor inteiro

Se quisermos fazer esse tipo de divisão, ou a famosa, "divisão com números quebrados", precisamos utilizar
outro tipo, o mais apropriado seria double ou float

```java
public class Aula015OperadoresAritimeticos01 {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int num1 = 10;
        double num2 = 20;
        double resultado = num1 / num2;
        System.out.println("O valor é " + resultado);
    }
}
```
Agora sim o valor que será impresso será

"O valor é 0.5"

Nós precisamos definir tanto a variável resultado quanto a nossa variável num2 como double,
porque o resultado da operação de dois números inteiros, será como resultado um número inteiro

No caso se tirarmos o double da variável num2, o resultado será 0.0

Por isso precisamos definir tanto nossa variável num2 ou num1, quanto nossa variável resultado