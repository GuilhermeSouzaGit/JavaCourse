package java_core.aula_048_OO_Metodos05ParametrosTipoPrimitivo.test;

import java_core.aula_048_OO_Metodos05ParametrosTipoPrimitivo.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
