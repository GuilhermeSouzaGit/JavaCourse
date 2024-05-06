# Modificadores de Acesso parte 02 - private, get e set
Na aula passada fomos introduzidos aos modificadores de acesso, e se repararmos, nós tinhamos nosso código fazendo
duas coisas iguais, nós tinhamos o método imprime que retorna os valores em memória, e nós tinhamos nossos métodos
getNome e getIdade, que taambém retornava os valores em memória. Então para evitar isso nós poderíamos fazer isso?
```java
public void imprime() {
    System.out.println(getNome());
    System.out.println(getIdade());
}
```
E a resposta é não. Isso não é muito aconselhavel a se fazer, pois esteticamente é feio e de certa forma o this.nome
é mais garantido que o getNome, pois o this.nome ele certamente vai ir até o valor em memória, então é mais aconselhável
utilizar o que fizemos na aula passada.
```java
public void imprime() {
    System.out.println(this.nome);
    System.out.println(this.idade);
}
```