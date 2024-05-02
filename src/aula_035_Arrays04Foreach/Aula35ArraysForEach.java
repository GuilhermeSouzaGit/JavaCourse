package aula_035_Arrays04Foreach;

public class Aula35ArraysForEach {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros3[i]);
//        }

        for (int i : numeros2) {
            System.out.println(i);
        }
    }
}
