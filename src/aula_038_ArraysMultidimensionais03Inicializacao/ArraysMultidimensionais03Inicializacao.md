# Arrays Multidimensionais parte 3 - Inicialização
Código base da aula
```java
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
```

## Forma 1: Inicialização com Tamanho Específico

```text
arrayInt[0] = new int[2];
```
Nesta forma, um array unidimensional de tamanho 2 é inicializado e atribuído à primeira posição (arrayInt[0]) 
do array multidimensional arrayInt.

## Forma 2: Inicialização com Valores
```text
arrayInt[1] = new int[]{1, 2, 3};
```
Aqui, um array unidimensional com os valores {1, 2, 3} é criado e atribuído à segunda posição (arrayInt[1]) do array multidimensional arrayInt.

## Forma 3: Inicialização com Variável
Primeiramente nós criamos a variável
```text
int[] array = { 1, 2, 3, 4 };
```
E atribuimos ela ao nosso array na posição [2]
```text
arrayInt[2] = array;
```

## Forma 4: Inicialização Direta
```text
int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
```
Aqui, o array multidimensional arrayInt2 é inicializado diretamente com os valores fornecidos, 
criando arrays unidimensionais de tamanho variável para cada posição.