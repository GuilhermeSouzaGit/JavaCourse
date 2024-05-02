# Arrays parte 3
## Como iterar sobre um Array e pegar todos os valores?
Nas aulas passadas vimos como criar e atribuir valores a um Array, e também vimos como fazemos para imprimir esse 
valores, porém se você lembrar, nós tivemos que escrever 3 vezes `System.out.println`, para imprimir os valores do
nosso Array, imagina se tivéssemos um Array com diversos dados? 

É aí que entra o nosso bom e velho `for`, através dele nós podemos iterar sobre os itens dentro do array, e podemos
imprimir através de um loop, todos os valores do nosso array, ou um número determinado de valores

`Exemplo:`
```java
public class Aula34Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Julio";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
```
E o resultado impresso será
```text
Julio
Pedro
Maria
```
Ok, até agora através do For nós já podemos economizar algumas linhas de código kkkkk.

Se nós quisessemos adicionar mais valores ao nosso array, nós precisaríamos alterar algumas informações dele,
por exemplo. Nesta linha `String[] nomes = new String[3];` o tamanho do nosso array teria que ser o número de valores
que queremos adicionar, por enquanto vamos trabalhar apenas com uma adição, então o tamanho passaria a ser 4

Nós precisaríamos também atribuir um valor a mais, vamos adicionar o nome "Felipe". 

Nosso código iria ficar `nomes[3] = "Felipe";`

Porém se repararmos, o nosso loop For ainda não vai imprimir esse último valor adicionado, porque estamos pedindo pra ele
para de iterar antes de chegar ao 3, então ele está imprimindo o valor 0, 1, 2 e só. Para fazer essa mudança é simples,
só adicionar agora o número 4, ao nosso for. Ficando assim
```text
for (int i = 0; i < 4; i++) {
    System.out.println(nomes[i]);
}
```
E pronto, agora todos os nossos valores serão impressos, mas parece bem trabalhoso isso, sempre que adicionarmos novos
valores, teremos que mudar tudo isso de código?, e a resposta é não!, nós podemos colocar uma palavra chama `length`,
basicamente a função dela é mostrar para nós o tamanho do nosso array, isso no código ficaria assim
```java
public class Aula34Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Julio";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";
        nomes[3] = "Felipe";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
```
E os valores impressos serão
```text
Julio
Pedro
Maria
Felipe
```