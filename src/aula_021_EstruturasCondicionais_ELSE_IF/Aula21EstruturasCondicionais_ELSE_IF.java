package aula_021_EstruturasCondicionais_ELSE_IF;

public class Aula21EstruturasCondicionais_ELSE_IF {
    public static void main(String[] args) {
        int idade = 18;
        String comprarBebiba = "";
        if (idade > 18 || idade == 18) {
            comprarBebiba =  "Pode comprar bebida alcóolica.";
        } else if (idade >= 16) {
            comprarBebiba =  "Pode comprar refrigerante.";
        }
        System.out.println(comprarBebiba);
    }
}
