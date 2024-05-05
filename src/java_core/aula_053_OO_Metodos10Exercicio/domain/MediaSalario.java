package java_core.aula_053_OO_Metodos10Exercicio.domain;

public class MediaSalario {
    public void mediaSalario(double... salario) {
        double media = 0;
        for (int i = 0; i < salario.length; i++) {
            media += salario[i];
        }
        media = media / salario.length;
        System.out.println("A média de salário de todos os funcionários é " + media);
    }
}
