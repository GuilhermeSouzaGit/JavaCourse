package java_core.aula_056_OO_ModificadorDeAcesso_private_get_set03;

import java_core.aula_056_OO_ModificadorDeAcesso_private_get_set03.domain.Funcionario;
import java_core.aula_056_OO_ModificadorDeAcesso_private_get_set03.domain.MediaSalario;

public class ExecutaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario.nome = "Carlos";
        funcionario.idade = 21;
        funcionario.salario = 1396.00;
        funcionario.imprimeFuncionario();

        funcionario2.nome = "Felipe";
        funcionario2.idade = 27;
        funcionario2.salario = 2100.00;
        funcionario2.imprimeFuncionario();

        funcionario3.nome = "Joao";
        funcionario3.idade = 38;
        funcionario3.salario = 3900.00;
        funcionario3.imprimeFuncionario();

        MediaSalario mediaSalario = new MediaSalario();
        mediaSalario.mediaSalario(funcionario.salario, funcionario2.salario, funcionario3.salario);
    }
}
