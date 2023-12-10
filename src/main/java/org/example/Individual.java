package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Individual {
    ArrayList<Integer> listGenes;

    public void individual(int value){

    }

    public ArrayList<Boolean> mutate(ArrayList<Boolean> list){
        Random random = new Random();
        int mutateProbality = 1;
        int number;
        number = random.nextInt(0, 500);
        if(number <= mutateProbality){
            number = random.nextInt(0, 16);
            boolean bo = list.get(number);
            if(bo){
                list.set(number, false);
            }
            if(!bo) {
                list.set(number, true);
            }
            return list;
        }
        return list;
    }

}
