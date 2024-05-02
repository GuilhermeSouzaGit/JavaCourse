# Arrays parte 4 - Foreach
## Formas de inicializar um Array
Na aula passada vimos alguns "truques" que nos permitem escrever menos códigos e fazer menos alterações, que no caso
seria o uso de um loop for para imprimir os valores do array sem a necessidade de escrever diversos `System.out.println`
e vimos também a palavra `length`, que retorna para nós o tamanho do array, nos permitindo fazer menos alterações 
quando mudamos o tamanho do nosso array.

E nessa aula nós iremos ver outras formas de inicializar um array, para assim podermos escrever menos códigos ainda.

Uma delas é dessa forma `int[] numeros2 = {1,2,3,4,5};`, já atribuindo os valores ao nosso array e ele automaticamente
já detectando qual o tamanho desse array.

Outra forma é `int[] numeros3 = new int[]{1,2,3,4,5};` que basicamente é similar a forma anterior

E a outra forma é a que vimos nas aulas passadas que seria `int[] numeros = new int[5];`, porém desse jeito estamos apenas
inicializando ela, para atribuirmos os valores a ela teríamos que escrever linha por linha

Mostrando todas as formas no código abaixo:

```java
public class Aula35ArraysForEach {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros3[i]);
        }
    }
}
```
## Foreach
O `forEach` é uma alternativa do `for`, ele apresenta uma forma mais simples de imprimirmos os valores de um array, 
a sintaxe dele é assim:
```text
for (int i : numeros2) {
    System.out.println(i);
}
```
Ele é uma forma simplificada de imprimir os valores de uma array, basicamente ele funciona assim.
```text
int i = numeros2[0]
System.out.println(i)

int i = numeros2[1]
System.out.println(i)

int i = numeros2[2]
System.out.println(i)

E assim por diante
```