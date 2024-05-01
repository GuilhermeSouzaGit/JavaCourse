# Operadores de atribuição

## Quais são?
Existem alguns operadores de atribuição, e são eles o

- = (Atribuição normal)
- += (Atribuição de soma)
- -+ (Atribuição de subtração)
- *= (Atribuição de multiplicação)
- /= (Atribuição de divisão)
- %= (Atribuição de resto)

No código abaixo irei explicar melhor

```java
public class Aula19OperadorAtribuicao {
    public static void main(String[] args) {
        // Atribuição normal
        int a = 10; // a = 10
        System.out.println("Atribuição normal: a = " + a); // Atribuição normal: a = 10

        // Atribuição de soma
        int b = 5;
        b += 3; // Equivalente a b = b + 3; => b = 5 + 3 = 8
        System.out.println("Atribuição de soma: b = " + b); // Atribuição de soma: b = 8

        // Atribuição de subtração
        int c = 8;
        c -= 2; // Equivalente a c = c - 2; => c = 8 - 2 = 6
        System.out.println("Atribuição de subtração: c = " + c); // Atribuição de subtração: c = 6

        // Atribuição de multiplicação
        int d = 6;
        d *= 4; // Equivalente a d = d * 4; => d = 6 * 4 = 24
        System.out.println("Atribuição de multiplicação: d = " + d); // Atribuição de multiplicação: d = 24

        // Atribuição de divisão
        int e = 20;
        e /= 5; // Equivalente a e = e / 5; => e = 20 / 5 = 4
        System.out.println("Atribuição de divisão: e = " + e); // Atribuição de divisão: e = 4

        // Atribuição de resto
        int f = 15;
        f %= 7; // Equivalente a f = f % 7; => f = 15 % 7 = 1
        System.out.println("Atribuição de resto: f = " + f); // Atribuição de resto: f = 1
    }
}
```
Esses operadores são muito úteis para não precisar reescrever código

Em vez de você colocar

```text
contador = 0
contador = contador + 1
```
Você pode apenas colocar
```text
contador = 0
contador += 1
```
Dessa forma nós não precisamos ficar escrevendo mais código

E existe um outro operador também que iremos utilizar mais a frente que é o operador ++ e --

Que funciona de forma mais simplificada ainda

Em vez de escrevermos
```text
contador += 1
```
Nós podemos escrever
```text
contador++ ou contador--
```
Porém tem uma observação, apenas é possível colocar ++ e --, não é possível colocar +++ ou --- e etc.

Outra observação também é que ele funciona apenas de 1 em 1, então contador que é 0 e nós utilizamos
contador++, ele vai passar a valer 1, se utilizarmos de novo, passará a valer 2, e assim em diante