package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Boolean>> genes = new ArrayList<>(16);
        Random random = new Random();

        for (int i = 0; i < 16; i++) {
            genes.add(new ArrayList<>());
        }

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                genes.get(i).add(random.nextBoolean());
            }
        }


        Individual individual = new Individual();

        Evolve evolve = new Evolve();

        int inFirstEightOfFitness;
        int inSecondEightOfFitness;


        ArrayList<ArrayList<Double>> listFitness = null;

        for (int k = 0; k < 200000; k++) {

            listFitness = evolve.fitness(genes);
            Comparator<ArrayList<Double>> comparator = Comparator.comparingDouble(row -> row.get(0));
            Collections.sort(listFitness, comparator);


            for (int i = 0; i < 8; i++) {

                inFirstEightOfFitness = (int) Math.round(listFitness.get(i).get(3));
                inSecondEightOfFitness = (int) Math.round(listFitness.get(i + 8).get(3));

                int randomPosition = random.nextInt(10) + 5;

                for (int j = randomPosition; j < 16; j++) {
                    genes.get(inFirstEightOfFitness).set(j, genes.get(inSecondEightOfFitness).get(j));
                }
            }
            for (int i = 0; i < 16; i++) {
                genes.set(i, individual.mutate(genes.get(i)));
            }

        }
        for(int h = 0; h < 16; h++) {

            System.out.print(listFitness.get(h).get(0) + " ");


        }
        System.out.println();
        double l = listFitness.get(15).get(3);
        int p = (int) l;
        System.out.println(listFitness);
        System.out.println(genes.get(p));


    }
}