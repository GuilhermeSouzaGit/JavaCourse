package aula_034_Arrays03;

public class Aula34Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Julio";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";
        nomes[3] = "Felipe";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
