package aula_038_ArraysMultidimensionais03Inicializacao;

public class Aula35ArraysMultidimensionaisInicializacao {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

        int[][] arrayInt = new int[3][0];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = array;

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        for(int[] arrayBase : arrayInt) {
            System.out.println("\n----------");
            for(int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
