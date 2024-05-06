# Modificadores de Acesso parte 01 - private, get e set
Hoje a aula de hoje é sobre acoplamento, e porque acoplamento?. Quando nós falamos que nosso código é altamente
coeso, e que quanto mais coesão no nosso código melhor, nós estamos falando que a quantidade de coisas que nosso
código está fazendo é mínima.

Alto acoplamento = ruim

Baixo acoplamento = bom

Acoplamento é o quanto uma classe conhece da outra

```java
public class Pessoa {
    public String nome;
    public int idade;
}

```
```java
import java_core.aula_054_OO_ModificadorDeAcesso_private_get_set01.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Joao";
        pessoa.idade = 21;
    }
}
```
No código acima nós começamos a ter problemas com acoplamento, que é o quanto uma classe está conectada com a outra.
No nosso caso, a Pessoa e PessoaTest estão altamente conectadas, porque estamos acessando os métodos de forma pública.

```java
public class Pessoa {
    public String nome;
    public int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
```
```java
import java_core.aula_054_OO_ModificadorDeAcesso_private_get_set01.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Joao";
        pessoa.idade = 21;

        pessoa.imprime();
    }
}
```
Agora nós fizemos um método pra ficar responsável apenas por imprimir, mas ainda temos um problema. Se por algum
acaso o usuário na idade digitar `-1`, o código irá funcionar normalmente, o que não deveria acontecer no caso,
e para fazermos algo para bloquear ou evitar isso, nós iremos afetar o funcionamento da classe PessoaTest. 

Então para isso nós temos os modificadores de acesso, uma forma de garantir o baixo acoplamento é utilizarmos 
modificadores de acesso privados (`private`).

Até o momento apenas utilizávamos o `public`, agora iremos utilizar o modificador `private`.

Um modificador de acesso privado significa que esses atributos só poderão ser acessados através do objeto
```java
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
```
Se tentarmos executar a nossa classe PessoaTest, iremos receber um erro indicando que o nome e idade são atributos
de acesso privado, digamos que não éramos nem para saber que eles existiam, já que são privados.

Quando nós criamos atributos privados, nós conseguimos acessa-los criando métodos para eles. O método fica público
mas os atributos ficam privados, onde para atribuir um valor ou pedir para imprimi-lo, nós basicamente estaremos
utilizando um intermediador, onde ele vai fazer o meio campo entre o código onde estamos chamando, e o código
onde estão nossos atributos.

E uma das maiores conveções que existe no Java, é quando nós vamos fazer um método responsável por colocar um valor
dentro de um atributo em memória, nós primeiramente escrevemos a palavra `set`.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```
E agora nós executamos nosso código não mais adicionando um valor diretamente no atributo, mas sim utilizando o 
método setNome, para assim ele fazer a intermediação e cuidar da parte de adicionar o valor
```java
import java_core.aula_054_OO_ModificadorDeAcesso_private_get_set01.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(21);

        pessoa.imprime();
    }
}
```
Ok, mas agora como nós protegemos do problema que nos foi apresentado no início, de como evitar ou bloquear que o 
usuário digite valores que não condizem com nossos atributos, por exemplo `setIdade(-1)`?

```java
public void setIdade(int idade) {
    if (idade < 0) {
        System.out.println("Idade inválida");
        return;
    }
    this.idade = idade;
}
```
Agora nós conseguimos adicionar medidas para prevenir inputs diferentes do previsto.

Mas e para pegar um atributo? já que não conseguimos utilizar mais o pessoa.nome?

Através do get...
```java
public String getNome() {
    return nome;
}
```
Dessa vez foi bem mais simples kkkkk, e agora é só irmos no nosso pessoa test e chamar o método pessoa.getNome()