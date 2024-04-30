# Tipos primitivos parte 3 - Casting

## O que é o casting?

Casting é a conversão de objetos ou tipos primitivos de um tipo para outro tipo. Ao se tratar casting, considera-se a necessidade de conversão explícita entre tipos – o que, potencialmente, pode causar perdas de informação.

Ou, em outras palavras

Casting é você forçar um valor dentro de uma variável que na teoria não deveria ser possível, por exemplo

```java
int idade = 10;
isso é um valor possível dentro de Java, mas e se quisermos forçar um valor?

int idade = 10000000000;
se tentarmos executar este código acima, antes mesmo de compilar a IDE já vai nos avisar que não é possível, provavelmente com uma mensagem do tipo
'Integer number too large'

Porém através do casting isso é "possível" 

ao tentarmos fazer isso

int idade = (int) 10000000000L;

O compilador até vai executar isso, mas irá ter perca de bits, ao tentar encaixar um valor maior do que a capacidade

Como nós já vimos na tabela mostrada na Aula 11, o int cabe 4 bytes, já o long cabe 8bytes

Então ao tentar encaixar um valor maior, na força bruta irá se perder alguns bits, para tentar encaixar o valor
```

Para mais informações visitar a aula 12

https://youtu.be/74hd4o7V328?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW