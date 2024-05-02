package aula_029_EstruturasDeRepeticao_03_break;

public class Aula29Break {
    // Imprima os primeiros 25 números de um dado valor
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i <= 25) {
                System.out.println(i);
            }
            System.out.println("i = " + i);
        }
    }
}
