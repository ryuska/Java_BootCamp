package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Populate arrays

        for (int i = 0; i <=10; i++) {

            String[] rice = {"white rice", "brown rice", "no rice"};

            Random rnd = new Random();
            int a = rnd.nextInt(rice.length);


            String[] meat = {"chicken meat", "steak meat", "carnidas meat", "chorizo meat", "sofritas meat", "veggies"};
            int b = rnd.nextInt(meat.length);

            String[] beans = {"pinto beans", "black beans", "no beans"};
            int c = rnd.nextInt(beans.length);

            String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
            int d = rnd.nextInt(salsa.length);

            String[] veggies = {"lettuce", "fajita veggies", "no veggies"};
            int k = rnd.nextInt(veggies.length);


            System.out.println("Burrito\t" + i + ":\t" + rice[a]+ ",\t" + meat[b]+ ",\t" + beans[c]+ ",\t" + salsa[d]+ ",\t" + veggies[k]);

        }
    }
}