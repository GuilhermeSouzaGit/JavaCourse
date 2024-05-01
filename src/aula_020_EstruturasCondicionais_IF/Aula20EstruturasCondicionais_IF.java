package aula_020_EstruturasCondicionais_IF;

public class Aula20EstruturasCondicionais_IF {
    public static void main(String[] args) {
        // Vamos fazer uma verificação para compras de bebida alcólicas
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar bebida alcólica");
        }
    }
}
