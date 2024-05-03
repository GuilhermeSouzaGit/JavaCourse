package java_core.aula_048_OO_Metodos05ParametrosTipoPrimitivo.dominio;

public class Calculadora {
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + numero1);
        System.out.println("num2 " + numero2);
    }
}
