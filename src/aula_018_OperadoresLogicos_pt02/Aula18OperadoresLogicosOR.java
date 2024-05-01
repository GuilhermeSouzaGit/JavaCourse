package aula_018_OperadoresLogicos_pt02;

public class Aula18OperadoresLogicosOR {
    public static void main(String[] args) {
        // || (or)

        // Vamos fazer uma comparação sobre a função Esqueci minha senha
        boolean temAcessoAoEmail = false;
        boolean temAcessoAoNumDeTelefone = false;

        boolean consegueRecuperarSuaConta = temAcessoAoEmail || temAcessoAoNumDeTelefone;
        System.out.println("O usuário consegue recuperar sua conta? " + consegueRecuperarSuaConta);
    }
}
