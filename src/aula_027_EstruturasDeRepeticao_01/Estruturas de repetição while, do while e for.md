# Estruturas de repetição parte 1 - While, do while e for
While, do while e for, são as estruturas de repetições mais simples que nós possuímos no Java, e elas servem para iterar
sobre algum ou alguns valores.

## While
Assim como o `Switch`, o valor que é inserido dentro dos parênteses do `while`, precisa ser um valor `booleano, caso
contrário o código não irá funcionar

`Exemplo:`
```java
public class Aula27While_doWhile_for {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }
    }
}
```
Baseado no código acima, o que será impresso?

Isso mesmo, o que será impresso será
```text
0
1
2
3
4
5
6
7
8
9
```
OBS: Se por acaso nós não alterarmos o valor da variável `count`, o código ficaria num loop eterno, pois o valor dela
sempre seria menor que 0

## Do while
Ele basicamente tem o mesmo funcionamento do `while`, a diferença é que ele vai executar o código enquanto a condição
não for atingida, por exemplo.
```java
public class Aula27While_doWhile_for {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        do {
            System.out.println("dentro do do while");
        } while (count < 10);
    }
}
```
Neste caso acima, como já foi dito, esse código iria entrar num loop sem fim, porque a condição de count ser menor que 10
não será atingida nunca.

Ele só pararia caso fizessemos algo do tipo...
```java
public class Aula27While_doWhile_for {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        do {
            System.out.println("dentro do do while " + count);
            count++;
        } while (count < 10);
    }
}
```
No caso acima o que seria imprimido seria...
```text
dentro do do while 0
dentro do do while 1
dentro do do while 2
dentro do do while 3
dentro do do while 4
dentro do do while 5
dentro do do while 6
dentro do do while 7
dentro do do while 8
dentro do do while 9
```
## For
Diferentemente das outras estruturas de repetição, o funcionamento dele é diferente, geralmente ele é a estrutura de repetição mais usada
no dia a dia, e basicamente ele serve em sua grande maioria, para iterar sobre valores e imprimir talvez uma lista de coisas, por exemplo.
Para imprimir todas as publicações de um blog, nós podemos utilizar o `For`, para iterar sobre todas as publicações e imprimir todas elas.

No código ele é assim.
```java
public class Aula27While_doWhile_for {
    public static void main(String[] args) {
        // while, do while, for
        for (int i = 0; i < 10; i++) {
            System.out.println("Dentro do for " + i);
        }
    }
}
```
E o que será impresso será...
```text
Dentro do for 0
Dentro do for 1
Dentro do for 2
Dentro do for 3
Dentro do for 4
Dentro do for 5
Dentro do for 6
Dentro do for 7
Dentro do for 8
Dentro do for 9
```