package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Evolve {
    Package package1 = new Package(500,40, 5);
    Package package2 = new Package(25, 20, 6);
    Package package3 = new Package(55, 10, 8);
    Package package4 = new Package(65, 35, 6);
    Package package5 = new Package(400, 30, 6);
    Package package6 = new Package(25, 20, 5);
    Package package7 = new Package(20, 25, 5);
    Package package8 = new Package(10, 10, 4);
    Package package9 = new Package(450, 25, 10);
    Package package10 = new Package(10, 20, 3);
    Package package11 = new Package(5, 10, 2);
    Package package12 = new Package(15, 7, 9);
    Package package13 = new Package(25, 8, 3);
    Package package14 = new Package(35, 28, 7);
    Package package15 = new Package(45, 9, 12);
    Package package16 = new Package(35, 16, 14);

    public void check(ArrayList list){
        ArrayList<ArrayList<Boolean>> genes = new ArrayList<>(16);
        Random random = new Random();

        ArrayList<Boolean> listBoolean = new ArrayList<>();

        for (int i = 0; i <16; i++){
            genes.add(new ArrayList());
        };

        for(int i = 0; i<16; i++){
            for(int j = 0; j < 8; j++){
                genes.get(i).add(random.nextBoolean());
            };
        };
        System.out.println(genes);
    };

    public ArrayList<ArrayList<Double>> fitness(ArrayList<ArrayList<Boolean>> genes){
        ArrayList<ArrayList<Double>> listOfFitness = new ArrayList<>();

        for(int j = 0; j <16; j++) {
            ArrayList<Boolean> list = new ArrayList<>();


            double value = 0;
            double weight = 0;
            double size = 0;
            double fitness = 0;

            for (int i = 0; i < 16; i++) {
                if (genes.get(j).get(i)) {
                    value = value + package1.getListOfPackage().get(i).get(0);
                    weight = weight + package1.getListOfPackage().get(i).get(1);
                    size = size + package1.getListOfPackage().get(i).get(2);
                }
            }

            ArrayList<Double> listOfIntegerForFitness = new ArrayList<>();
            if (weight <= 100 && size <= 50) {
                listOfIntegerForFitness.add(value);
                listOfIntegerForFitness.add(weight);
                listOfIntegerForFitness.add(size);
                listOfIntegerForFitness.add((double) j);
                listOfFitness.add(listOfIntegerForFitness);
            }

            if (size > 50 || weight > 100) {
                listOfIntegerForFitness.add(0.0);
                listOfIntegerForFitness.add(weight);
                listOfIntegerForFitness.add(size);
                listOfIntegerForFitness.add((double) j);
                listOfFitness.add(listOfIntegerForFitness);
            }

//
//
//            if (value == 0) {
//                listOfIntegerForFitness.add(value);
//                listOfIntegerForFitness.add(weight);
//                listOfIntegerForFitness.add(size);
//                listOfIntegerForFitness.add((double) j);
//                listOfFitness.add(listOfIntegerForFitness);
//            }

        }
        return listOfFitness;
    };

}
