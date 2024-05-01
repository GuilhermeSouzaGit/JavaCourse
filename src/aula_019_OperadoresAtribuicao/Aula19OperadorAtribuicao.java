package aula_019_OperadoresAtribuicao;

public class Aula19OperadorAtribuicao {
    public static void main(String[] args) {
        // Atribuição normal
        int a = 10; // a = 10
        System.out.println("Atribuição normal: a = " + a); // Atribuição normal: a = 10

        // Atribuição de soma
        int b = 5;
        b += 3; // Equivalente a b = b + 3; => b = 5 + 3 = 8
        System.out.println("Atribuição de soma: b = " + b); // Atribuição de soma: b = 8

        // Atribuição de subtração
        int c = 8;
        c -= 2; // Equivalente a c = c - 2; => c = 8 - 2 = 6
        System.out.println("Atribuição de subtração: c = " + c); // Atribuição de subtração: c = 6

        // Atribuição de multiplicação
        int d = 6;
        d *= 4; // Equivalente a d = d * 4; => d = 6 * 4 = 24
        System.out.println("Atribuição de multiplicação: d = " + d); // Atribuição de multiplicação: d = 24

        // Atribuição de divisão
        int e = 20;
        e /= 5; // Equivalente a e = e / 5; => e = 20 / 5 = 4
        System.out.println("Atribuição de divisão: e = " + e); // Atribuição de divisão: e = 4

        // Atribuição de resto
        int f = 15;
        f %= 7; // Equivalente a f = f % 7; => f = 15 % 7 = 1
        System.out.println("Atribuição de resto: f = " + f); // Atribuição de resto: f = 1
    }
}
