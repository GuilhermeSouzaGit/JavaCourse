package java_core.aula_051_OO_Metodos08ReferenciaThis.test;

import java_core.aula_051_OO_Metodos08ReferenciaThis.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("-----------------------");
        estudante02.imprime();
    }
}