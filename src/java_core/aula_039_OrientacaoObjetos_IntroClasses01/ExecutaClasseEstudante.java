package java_core.aula_039_OrientacaoObjetos_IntroClasses01;

import java_core.aula_039_OrientacaoObjetos_IntroClasses01.dominio.Estudante;

public class ExecutaClasseEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Guilherme";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}