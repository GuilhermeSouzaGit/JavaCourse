# Orientação a objetos - Referência de objetos
Vamos utilizar como exemplo o nosso código da aula passada
```java
public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Logan";
        carro1.marca = "Renault";
        carro1.ano = 2016;

        carro2.nome = "Fusion";
        carro2.marca = "Ford";
        carro2.ano = 2022;

        System.out.println("O primeiro carro é o " + carro.nome + " da marca " + carro.marca + " e foi fabricado em " + carro.ano);
        System.out.println("O segundo carro é o " + carro2.nome + " da marca " + carro2.marca + " e foi fabricado em " + carro2.ano);
    }
}
```
Se nós executarmos o código acima, nos será mostrado os valores do `carro1` e `carro2`, mas como eu faço para fazer com
que o `carro1` faça referência ao mesmo espaço em memória onde o `carro2` está referenciando.

Primeiro, quem sabe onde o carro2 está na memória? O próprio carro2.

Então nós precisamos fazer o nosso `carro1` fazer referência ao mesmo objeto que o `carro2` está fazendo referência, 
e como isso fica no código?

```java
public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Logan";
        carro1.marca = "Renault";
        carro1.ano = 2016;

        carro2.nome = "Fusion";
        carro2.marca = "Ford";
        carro2.ano = 2022;

        carro1 = carro2;
        
        System.out.println("O primeiro carro é o " + carro.nome + " da marca " + carro.marca + " e foi fabricado em " + carro.ano);
        System.out.println("O segundo carro é o " + carro2.nome + " da marca " + carro2.marca + " e foi fabricado em " + carro2.ano);
    }
}
```
e agora se executarmos esse código, será impresso
```text
O segundo carro é o Fusion da marca Ford e foi fabricado em 2022
O segundo carro é o Fusion da marca Ford e foi fabricado em 2022
```
Pois nós estamos atribuindo o objeto `carro2` também ao objeto `carro1`, então ambos terão o mesmo resultado, e o 
valor previamente definido no `carro1` foi perdido para sempre na memória, já que substituímos ele pelo `carro2`

OBS: Nós só podemos fazer isso com objetos que são do mesmo tipo, essa parte nós iremos entender mais para frente nas aulas
de polimorfismo