# Métodos parte 6 - Parâmetros do tipo referência 02
Na aula passada vimos como passar argumentos de tipos primitivos, nessa aula iremos falar um pouco mais sobre.

Uma coisa que vimos nas aulas passadas, e aqui não muda, é inicializarmos com valores padrões, por exemplo.
```java
public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("--------------------------");
        
        estudante.nome = "Carlos";
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
```
Se nós executarmos o nosso código com o nosso método imprime assim, o valor que será retornado será
```text
--------------------------
Carlos
20
M
--------------------------
Carlos
15
F
```
Porque nós atribuimos esse valor antes de imprimir, então basicamente nós substituímos todas as vezes que o nosso 
código fosse imprimir, como nós imprimimos duas vezes, ele substituiu duas vezes

### E se trocarmos a ordem?
```java
public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("--------------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Carlos";
    }
}
```
e tentarmos executar, a resposta será
```text
--------------------------
João
20
M
--------------------------
Maria
15
F
```
Mas e se nós pedirmos para o nosso código executar novamente o método imprime?
```java
import java_core.aula_050_OO_Metodos07ParametrosTipoReferencia02.dominio.Estudante;
import java_core.aula_050_OO_Metodos07ParametrosTipoReferencia02.dominio.ImprimeEstudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("###############################");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
```
```text
--------------------------
João
20
M
--------------------------
Maria
15
F
###############################
--------------------------
Carlos
20
M
--------------------------
Carlos
15
F
```
O que acontece é o seguinte, o nosso método
```java
public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("--------------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Carlos";
    }
}
```
recebe o argumento do estudante01, ele imprime os dados que atribuímos e antes de finalizar o método ele muda o valor
do estudante01, de João para Carlos, logo em seguida o método é finalizado e inicia agora o do estudante02, e acontece
o mesmo processo, antes de finalizar o método o valor é alterado. 

Se nós fossemos imprimir apenas 1 vez, não íamos ver isso, porém o valor mudou mesmo assim, então se nós imprimirmos
mais uma vez, nós veremos que o valor em memória que foi substituído, foi alterado