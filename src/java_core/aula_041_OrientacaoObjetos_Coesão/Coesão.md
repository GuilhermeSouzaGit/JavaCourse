# Orientação a objetos - Coesão
## O que é a coesão?
Ela é algo que está relacionado ao propósito das nossas classes, o que significa? significa que, quando falamos que o 
nosso código está altamente coeso, nós estamos falando que nossas classes não estão misturando o propósito delas de existirem

## Mostrando na prática
Vamos imaginar que agora nós temos o seguinte caso, um objeto contendo os atributos relacionados ao Professor, que no caso seriam
```java
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public String nomeProfessor;
    public int idadeProfessor;
    public char sexoProfessor;
}
```
Este código está errado?

O código por si só, não está errado, sua sintaxe foi escrita da maneira correta, porém se formos pensar no propósito desse código,
manutenção e escalabilidade, está completamente errado.

Essa nossa classe Estudante tem `nome`, `idade` e `sexo`, e como não tem nada depois nós iremos assumir que esses atributos
são relacionados ao estudante, e logo depois temos `nome`, `idade` e `sexo` do Professor.

O problema começa quando nós começamos a fazer alterações nesse código, por exemplo, se no futuro nos pedirem para adicionar o 
número da matrícula do estudante? Nós iremos lá e iremos adicionar, e pedirem para adicionar o RG do professor, nós também iremos lá adicionar.
O maior problema aqui é que está classe que estamos é relacionada ao Estudante, e dentro dela estamos tratando dos dados dos estudantes e 
tratando dos dados dos professores, qualquer alteração que fizermos no Estudante, iremos afetar o Professor, e qualquer alteração no Professor,
iremos afetar o Estudante, a grosso modo isso não faz sentido nenhum, e a longo prazo isso irá ficar extremamente confuso, pois o número de classes
e atributos irá aumentar, ficando cada vez mais difícil de entender

Quando nós falamos que o nosso código tem que estar altamente coeso, estamos falando que o nosso código deve servir exatamente para apenas 1 propósito,
quando colocamos eles dentro do mesmo objeto, estamos dizendo que eles são a mesma coisa

O correto é separmos e organizarmos da maneira correta, os atributos do professor vão para a classe do Professor, e os atributos da classe
Estudante, permanecem na classe Estudante.

Da mesma forma nós não podemos fazer isso...
```java
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    
    public static void main(String[] args) {
        
    }
}
```
O código está errado?. Não, ele irá rodar normalmente, porém ao desenvolvermos aplicações precisamos seguir alguns princípios e conceitos 
para manter nosso código mais legível e de fácil manutenção. 

Então seguindo o princípio da `Coesão`, o código acima está completamente errado