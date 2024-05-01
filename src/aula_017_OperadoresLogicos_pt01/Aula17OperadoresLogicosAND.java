package aula_017_OperadoresLogicos_pt01;

public class Aula17OperadoresLogicosAND {
    public static void main(String[] args) {
        // && (and)

        // Vamos fazer uma comparação sobre quem pode ou não tirar carteira de habilitação
        int idadeJoao = 21;
        boolean isJoaoBrasileiro = true;
        int idadeFelipe = 16;
        boolean isFelipeBrasileiro = true;

        boolean isJoaoPermitidoTirarCNH = idadeJoao >= 18 && isJoaoBrasileiro;
        boolean isFelipePermitidoTirarCNH = idadeFelipe >= 18 && isFelipeBrasileiro;

        System.out.println("João é permitido tirar CNH? " + isJoaoPermitidoTirarCNH);
        System.out.println("Felipe é permitido tirar CNH? " + isFelipePermitidoTirarCNH);
    }
}
