# Estruturas de repetição parte 3 - Break

## O que é o Break e para o que ele serve?
O break é utilizado dentro dos laços de repetições, e serve para nós paramos a repetição.

E em quais situações ele serviria?

Por exemplo, se quisermos imprimir os primeiros 25 números de um dado valor, e esse valor for 50, ele iria imprimir
apenas os 25 primeiros números, e iria parar a repetição

No nosso caso o código ficaria assim.
```java
public class Aula29Break {
    // Imprima os primeiros 25 números de um dado valor
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i >= 25) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
```
E o valor impresso seria...
```text
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
i = 10
i = 11
i = 12
i = 13
i = 14
i = 15
i = 16
i = 17
i = 18
i = 19
i = 20
i = 21
i = 22
i = 23
i = 24
```
Algumas pontos são importantes de considerarmos, por exemplo, e se não tivéssemos colocado o break? Teria como fazer de
outra forma? sim e não, irei mostrar abaixo

Nós poderíamos fazer deste jeito
```java
public class Aula29Break {
    // Imprima os primeiros 25 números de um dado valor
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i <= 25) {
                System.out.println(i);
            }
            System.out.println("i = " + i);
        }
    }
}
```
Ok, mas qual o problema do código acima?

O problema do código acima é que o nosso laço não parou, pois primeiro nós pedimos para ele imprimir os valores menores
que 25, e ok, ele imprimiu, mas como nós não finalizamos o laço, e o nosso valor máximo que colocamos é 50, ele continuou rodando.
Então ele apenas imprimiu os 25 valores, e continuou rodando até o nosso `i` ser menor ou igual ao nosso valor máximo, e
é por isso que nós utilizamos o break, para evitar disso acontecer