# Estruturas Condicionais Parte 6 - Switch
A estrutura condicional Switch é basicamente igual a estrutura IF, ElSE e ELSE IF, o seu funcionamento é o mesmo
porém eles servem para situações diferentes
## Em quais situações usar o switch?
Digamos que a gente queira imprimir os dias da semana, baseado numa entrada do usuário, por exemplo. 
Imprimir o dia da semana, considerando 1 como domingo
```java
public class Aula25EstruturasCondicionais_switch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        if(dia == 1) {
            System.out.println("Domingo");
        } else if(dia == 2) {
            System.out.println("Segunda");
        } // e assim por diante...
    }
}
```
Se nós vermos acima, iremos reparar que seria necessário escrever diversos IF e ELSE IF, e é aí que entra a estrutura Switch,
ela veio justamente para facilitar e deixar nosso código mais simples em situações como essas, então em vez de fazermos
igual ao código acima, nós poderíamos fazer assim...
```java
public class Aula25EstruturasCondicionais_switch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
```
O código acima fica até mais legível né?. Então ele basicamente funciona assim, e sua sintaxe e bloco de código é assim,
agora vamos a explicação das palavras usadas nessa estrutura.

Basicamente o `Switch` nós podemos entender como se fosse uma palavra normal, indicando que iremos inicializar uma estrutura condicional `Switch`, 
e dentro dos parênteses do `Switch` nós colocamos o que nós queremos verificar, que no nosso caso foi a variável `dia`. 
E a palavra `case`, o que significa?, digamos que ela signifique o `if`, então nós podemos ler assim. Se a varíavel que colocamos dentro do `Switch` for 1,
nós executamos o código que está dentro do bloco do `case 1`, se a variável for 2, `case 2` e assim em diante. E esse tal de `break`, o que significa?.
Bem, ele serve para quando o nosso código dentro do bloco `case` for executado, ele pare de executar os outros "cases", por exemplo.
Se não tivéssemos colocado o `break`, assim que o nosso `case 5`fosse executado, ele iria executar o código dentro do `case 5` e o código do próximo `case` e assim em diante,
basicamente ele iria continuar executando os códigos até encontrar um outro `break`. E o `default` serve para termos um valor padrão, para prevenir
qualquer coisa que possa acontecer que não estávamos esperando, no nosso caso foi o texto "Opção Inválida"