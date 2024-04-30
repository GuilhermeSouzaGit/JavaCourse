# Tipos primitivos parte 4 - Strings

obs: a String não é um tipo primitivo, ela é um Reference Type, porém iremos usar bastante, por isso foi abordado nesta aula

## String é uma classe

No Java a String é uma classe, e como toda classe no Java, tem que ser inicializada com a primeira letra maiúscula

```java
public class Aula013_TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Guilherme";
    }
}
```

num tipo char, o correto é se utilizar aspas simples (' '), porém na String, o correto é utilizar aspas duplas (" ").
E diferentemente do char, uma string cabe um valor beeeeem maior

e para imprimir este valor é semelhante aos outros jeitos

```java
public class Aula013_TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Guilherme";

        System.out.println("O meu nome é " + nome);
    }
}
```