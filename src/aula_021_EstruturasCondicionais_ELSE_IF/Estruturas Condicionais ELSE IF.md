# Estruturas Condicionais Parte 2 - ELSE e ELSE IF

O `else` e `else if` são estruturas de controle utilizadas em conjunto com o `if` para criar condições alternativas em um código.

## ELSE

O `else` é utilizado para definir um bloco de código que deve ser executado caso a condição do `if` associado a ele seja falsa. Ele é opcional e só pode ser utilizado após um `if`.

Exemplo:

```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 16;
        if (idade >= 18) {
            System.out.println("Pode comprar bebida alcóolica.");
        } else {
            System.out.println("Não pode comprar bebida alcóolica.");
        }
    }
}
```
Neste exemplo, se a idade for menor que 18, a mensagem 
"Não pode comprar bebida alcóolica." será impressa, caso contrário, será impressa a 
mensagem "Pode comprar bebida alcóolica.".

# ELSE IF
O else if é utilizado para adicionar mais condições após um if. Ele permite verificar múltiplas condições encadeadas, caso a condição associada ao if seja falsa.

Exemplo:
```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 16;
        if (idade >= 18) {
            System.out.println("Pode comprar bebida alcóolica.");
        } else if (idade >= 16) {
            System.out.println("Pode comprar refrigerante.");
        } else {
            System.out.println("Não pode comprar bebida alcóolica ou refrigerante.");
        }

    }
}
```
Neste exemplo, se a idade for maior ou igual a 18, será impressa a mensagem "Pode comprar bebida alcóolica.". 
Se a idade for menor que 18, mas maior ou igual a 16, será impressa a mensagem "Pode comprar refrigerante.". 
Caso contrário, será impressa a mensagem "Não pode comprar bebida alcóolica ou refrigerante.".

## Outras maneiras de trabalhar com IF, ELSE e ELSE IF
Em vez de fazermos do jeito acima, colocando 3 vezes System.out.println, nós podemos fazer de outra maneira
```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 19;
        String comprarBebiba;
        if (idade >= 18) {
            comprarBebiba =  "Pode comprar bebida alcóolica.";
        } else if (idade >= 16) {
            comprarBebiba =  "Pode comprar refrigerante.";
        } else {
            comprarBebiba =  "Não pode comprar bebida alcóolica ou refrigerante.";
        }
        System.out.println(comprarBebiba);
    }
}
```
Dessa forma nós podemos apenas atribuir a variável comprarBebiba, em vez de ficarmos repetindo System.out.println e etc

OBS: Nós só podemos mostrar o valor acima, se a variável já estiver sido inicializada. No código acima como existe um else no final, de qualquer forma
a variável será iniciada, porém se o nosso código estiver assim...
```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 12;
        String comprarBebiba;
        if (idade >= 18) {
            comprarBebiba =  "Pode comprar bebida alcóolica.";
        } else if (idade >= 16) {
            comprarBebiba =  "Pode comprar refrigerante.";
        }
        System.out.println(comprarBebiba);
    }
}
```
Nós iremos sofrer com o erro "Variable 'comprarBebiba' might not have been initialized", porque nossa variável não foi inicializada,
já que a nossa idade não é nem maior ou igual a 18, e nem maior ou igual a 16, ela nunca será inicializada. Uma forma de desviar desse erro
seria inicializando ela antes de entrar no IF e etc, e nós podemos inicializar ela com qualquer valor, por exemplo...
```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 12;
        String comprarBebiba = "";
        if (idade >= 18) {
            comprarBebiba =  "Pode comprar bebida alcóolica.";
        } else if (idade >= 16) {
            comprarBebiba =  "Pode comprar refrigerante.";
        }
        System.out.println(comprarBebiba);
    }
}
```
Nesse caso nada seria impresso pois a variável está vazia, mas ela já foi inicializada, então não teríamos nenhum erro :)

### Uma outra maneira de trabalhar com IF é utilizando operadores lógicos ou operadores como AND, OR e NOT
Exemplo:
```java
public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 18;
        String comprarBebiba = "";
        if (idade > 18 || idade == 18) {
            comprarBebiba =  "Pode comprar bebida alcóolica.";
        } else if (idade >= 16) {
            comprarBebiba =  "Pode comprar refrigerante.";
        }
        System.out.println(comprarBebiba);
    }
}
```
No código acima, a primeira operação IF se lê: Se idade for maior que 18 OU igual a 18, pode comprar bebida alcólica

Se você reparar, é a mesma coisa que o código anterior, onde em vez de estar essa operação acima, estava apenas `idade >= 18`