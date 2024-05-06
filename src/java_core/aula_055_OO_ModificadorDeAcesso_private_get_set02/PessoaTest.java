package java_core.aula_055_OO_ModificadorDeAcesso_private_get_set02;

import java_core.aula_055_OO_ModificadorDeAcesso_private_get_set02.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(21);

        pessoa.imprime();
    }
}
