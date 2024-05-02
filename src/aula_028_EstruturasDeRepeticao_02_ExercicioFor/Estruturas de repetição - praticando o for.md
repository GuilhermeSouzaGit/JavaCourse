# Estruturas de repetição parte 2 - Exercício For
Neste exercício foi solicitado que imprimisse todos os números pares de 0 até 100
## Como nós podemos fazer?
Este é um exercício bem simples, porém para explicar irei fazer ele linha por linha.
```java
public class Aula28ExercicioFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
        }
    }
}

```
Primeiro nós precisamos inicializar o nosso for e definir as condições e valores. Como nós queremos imprimir todos 
os números pares do 0 ao 100, nós primeiramente precisamos descobrir quais são esses valores, e como descobrimos isso?

Se nós voltarmos alguns aulas atrás, nós iremos ver sobre o operador % (resto), e se bem lembramos, ele pode ser usado
para descobrir se um número é par ou não, e como?

Basicamente ele funciona como o operador `/`, a diferença é que em vez dele retornar o resultado dessa divisão, ele
retorna o `resto` dessa divisão, e como nós descobrimos se um valor é par?, dividindo ele por 2 e vendo se o resto é
0 ou não, caso seja  0, o número é par, caso contrário, ímpar.

Ok, já sabemos como fazemos para descobrir se o valor é par ou não, porém como iremos imprimir ele?, sabendo que
precisamos imprimir apenas os valores pares.

Isso mesmo!, através do `if`.

Através dele nós conseguimos verificar que, `se` o número for par, ou em outras palavras, se o resto dessa divisão for 0,
imprima esse número, vamos ver como fica no código?
```java
public class Aula28ExercicioFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```
Ele ficaria assim, nós iremos verificar se o resto da divisão é igual a 0, caso seja, ele irá imprimir a variável `i`,
que se reparmos, a cada volta desse loop, nós estamos somando 1, ao valor da variável `i`. Linha por linha ele fica assim

```text
O primeiro loop o valor é 0
0 é igual a 0 ? se sim, imprima ele
agora na próxima volta nossa variável `i` está valendo 1
o resto da divisão de 1 por 2 é igual a 0 ? não, então nós passamos para a próxima volta do loop
agora nossa variável está valendo 2
o resto da divisão de 2 por 2 é igual a 0 ? sim, então imprima a variável `i`, que nesse caso é 2
e por aí vai...
```
As primeiras repetições do nosso loop ficariam assim
```text
0
2
4
6
8
10
12
```