# Orientação a objetos - Exercício Classes
Crie uma classe `carro` com os seguintes atributos
```text
Nome
Marca
Ano
```
Em seguida, crie dois objetos distintos e imprima seus valores

## Resolução do exercício
```java
public class Carro {
    public String nome;
    public String marca;
    public int ano;
}
```
```java
import java_core.aula_042_OO_ExerciciosClasses.model.Carro;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Logan";
        carro.marca = "Renault";
        carro.ano = 2016;

        carro2.nome = "Fusion";
        carro2.marca = "Ford";
        carro2.ano = 2022;

        System.out.println("O primeiro carro é o " + carro.nome + " da marca " + carro.marca + " e foi fabricado em " + carro.ano);
        System.out.println("O segundo carro é o " + carro2.nome + " da marca " + carro2.marca + " e foi fabricado em " + carro2.ano);
    }
}
```
E a resposta foi
```text
O primeiro carro é o Logan da marca Renault e foi fabricado em 2016
O segundo carro é o Fusion da marca Ford e foi fabricado em 2022
```