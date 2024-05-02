package aula_022_EstruturasCondicionais_OperadorTernario;

public class Aula22EstruturasCondicionais_OperadorTernario {
    public static void main(String[] args) {
        int salario = 3800;
        String playstation5 = "Vou comprar um playstation 5";
        String xboxone = "Vou comprar um xboxone";
        // (condição) ? verdadeiro : falso
        String resultado = salario >= 4200 ? playstation5 : xboxone;
        System.out.println(resultado);
    }
}
