# Executando a compilação manualmente

## Como compilar um código em .java?

Assim que nós finalizamos de escrever nosso código, nós precisamos compilar ele pra assim ele ser convertido para .class (linguagem de máquina) e ser possível rodar na JVM em diversos sistemas.

Para isso fiz um pequeno código no notepad para fazer minha primeira compilação.

```java
public class TestandoCompilacao {
    public static void main (String[] args){
        System.out.println("Hello World");
    }
}
```

## Pontos importantes a se observar:

- O nome da classe (TestandoCompilacao) deve ser obrigatoriamente o mesmo nome do arquivo, por exemplo, se o nome do arquivo for "testandoCompilacao", o comando para compilar simplesmente não vai conseguir executar
- O código que escrevi para exemplificar foi feito no notepad, logo foi necessário mudar o tipo do arquivo para all files, e depois salvar como .java
- Para compilar o código é necessário abrir o cmd (ou qualquer outro terminal) e navegar até a pasta onde foi salvo o arquivo contendo o código, após isso é só executar javac + o nome do arquivo (lembrando que o nome do arquivo tem que ser o mesmo nome da classe)
- Feito isso será criado um arquivo com o mesmo nome porém com a extensão .class, (isso significa que conseguimos compilar e o código foi "traduzido" para linguagem de máquina)

## Como executar este código compilado?

Se nós tentarmos abrir com o bloco de notas o código que foi compilado, iremos ver que não dá pra entender absolutamente nada (kkkkk), porque ele foi traduzido para a linguagem de máquina.

Ok, mas como executamos?

Novamente será preciso ir ao cmd, e executar o comando java + o nome do arquivo, porém tem uma observação aqui. Se nós tentarmos executar escrevendo java "nome do arquivo".class que é a extensão do arquivo compilado, não será possível rodar o código, porque não será possível achar o arquivo
O jeito certo de rodar é
```bash
java "nome do arquivo"
no meu caso
java TestandoCompilacao
```

Logo após isso iremos ver o "Hello World"

## Outros pontos importantes a se observar são possíveis erros que podem acontecer

- O nome da classe deve ser exatamente o mesmo que o nome do arquivo
- é OBRIGATÓRIO o uso de ; para determinar o final da linha de um código
- Toda e qualquer alteração no código fonte, é necessário realizar novamente a compilação para assim ser executado novamente o código
