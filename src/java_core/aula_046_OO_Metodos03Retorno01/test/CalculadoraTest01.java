package java_core.aula_046_OO_Metodos03Retorno01.test;

import java_core.aula_046_OO_Metodos03Retorno01.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
