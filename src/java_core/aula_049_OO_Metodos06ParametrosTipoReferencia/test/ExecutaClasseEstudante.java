package java_core.aula_049_OO_Metodos06ParametrosTipoReferencia.test;

import java_core.aula_049_OO_Metodos06ParametrosTipoReferencia.dominio.Estudante;
import java_core.aula_049_OO_Metodos06ParametrosTipoReferencia.dominio.ImprimeEstudante;

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
    }
}