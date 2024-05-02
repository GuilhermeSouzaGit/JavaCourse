# Estruturas Condicionais Parte 7 - Praticando o Switch
Dado os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo

A maneira que eu fiz foi desse jeito...
```java
public class Aula26EstruturasCondicionais_ExercicioSwitch {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 8;
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo e é final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda e é dia útil");
                break;
            case 3:
                System.out.println("Hoje é terça e é dia útil");
                break;
            case 4:
                System.out.println("Hoje é quarta e é dia útil");
                break;
            case 5:
                System.out.println("Hoje é quinta e é dia útil");
                break;
            case 6:
                System.out.println("Hoje é sexta e ainda não é dia útil");
                break;
            case 7:
                System.out.println("Hoje é sábado e graças a Deus é final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
```