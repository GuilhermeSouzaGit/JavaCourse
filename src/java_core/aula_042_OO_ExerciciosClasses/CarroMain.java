package java_core.aula_042_OO_ExerciciosClasses;

import java_core.aula_042_OO_ExerciciosClasses.model.Carro;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Logan";
        carro.marca = "Renault";
        carro.ano = 2016;

        carro2.nome = "Fusion";
        carro2.marca = "Ford";
        carro2.ano = 2022;

        System.out.println("O primeiro carro é o " + carro.nome + " da marca " + carro.marca + " e foi fabricado em " + carro.ano);
        System.out.println("O segundo carro é o " + carro2.nome + " da marca " + carro2.marca + " e foi fabricado em " + carro2.ano);
    }
}
