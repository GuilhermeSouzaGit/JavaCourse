package java_core.aula_052_OO_Metodos09Varargs.test;

import java_core.aula_052_OO_Metodos09Varargs.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaVarArgs(1 , 2, 3, 4, 5);
    }
}
