package java_core.aula_054_OO_ModificadorDeAcesso_private_get_set01;

import java_core.aula_054_OO_ModificadorDeAcesso_private_get_set01.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(21);

//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
