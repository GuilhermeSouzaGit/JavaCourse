package aula_037_ArraysMultidimensionais02Foreach;

public class Aula35ArraysMultidimensionaisForeach {
    public static void main(String[] args) {
        // 1,2,3 Meses
        // 31,28,31 Dias
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;


        for(int[] i: dias) {
            for(int j: i) {
                System.out.println(j);
            }
        }
    }
}