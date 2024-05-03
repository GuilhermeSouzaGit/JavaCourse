package java_core.aula_041_OrientacaoObjetos_Coesão;

import java_core.aula_041_OrientacaoObjetos_Coesão.dominio_ou_model.Professor;

public class ProfessorMain {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Tales";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("O nome do professor é " + professor.nome + ", ele tem " + professor.idade + " anos de idade e é do sexo " + professor.sexo);
    }
}
