# Estruturas de repetição parte 4 - Exercício Break
Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado, mas a
condição é que o valor da parcela tem que ser maior ou igual a 1000
```java
public class Aula30ExercicioBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // A condição é que o valor da parcela tem que ser maior ou igual a 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " Valor: " + valorParcela);
        }
    }
}
```