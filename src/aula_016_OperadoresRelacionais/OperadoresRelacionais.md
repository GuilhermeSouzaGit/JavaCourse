# Operadores Relacionais
## Quais são?
Temos o operador de resto ( % ), e temos os operadores lógicos ( <, >, <=, >=, ==, != )

## Operador %
Nós utilizamos o operador de resto assim

```java
public class Aula016OperadoresRelacionais {
    public static void main(String[] args) {
        int resto = 20 % 2;
        System.out.println(resto);
    }
}
```

## Qual a utilidade do operador de resto? ( % )

Por exemplo se quisermos saber se um número é par ou impar, se ele for par, é divisível por 2, se não,
não é divisível por 2

No código mais acima nós já sabemos que 20 é par, porque o valor que será impresso será 0, significando que
é divisível por 2

## Operador > e <
OBS: a partir de agora todos os operadores retornam resultados booleanos

```java
public class Aula016OperadoresRelacionais {
    public static void main(String[] args) {
        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println("10 é maior que 20? " + isTenBiggerThanTwenty);
    }
}
```

O que será impresso?

"10 é maior que 20? false"

## Operador == e !=
```java
public class Aula016OperadoresRelacionais {
    public static void main(String[] args) {
        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println("10 é igual a 20? " + isTenEqualToTwenty);
    }
}
```

Na operação acima estamos comparando se 10 é igual a 20, o resultado disso é...

"10 é igual a 20? false", no caso, 10 não é igual a 20

e como fica o operador !=?
```java
public class Aula016OperadoresRelacionais {
    public static void main(String[] args) {
        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println("10 é diferente de 20? " + isTenDifferentFromTwenty);
    }
}
```
No código acima estamos perguntando se 10 é diferente de 20, utilizando o operador !=

O resultado é...

"10 é diferente de 20? true". Sim, 10 é diferente de 20.

## Resumos dos operadores

- < e > significam menor e maior, respectivamente
- <= e >= significam menor ou igual e maior ou igual
- == e != significam igual e diferente respectivamente

OBS: O sinal de =, significa atribuição, por exemplo quando vamos atribuir um valor a uma variável
```java
int idade = 20;
```
Já o sinal de == significa comparação, por exemplo quando vamos comparar dois valores
```java
boolean isDezIgualDez = 10 == 10;
```
No caso do código acima a resposta seria sempre true, porque 10 sempre vai ser igual a 10