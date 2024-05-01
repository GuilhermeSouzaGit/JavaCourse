package aula_016_OperadoresRelacionais;

public class Aula016OperadoresRelacionais {
    public static void main(String[] args) {
        // %
        int resto = 20 % 2;
        System.out.println(resto);
        // < >
        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println("10 é maior que 20? " + isTenBiggerThanTwenty);
        // == e !=
        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println("10 é igual a 20? " + isTenEqualToTwenty);

        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println("10 é diferente de 20? " + isTenDifferentFromTwenty);
    }
}
