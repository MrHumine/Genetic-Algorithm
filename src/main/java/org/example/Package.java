package org.example;

import java.util.ArrayList;

public class Package {
    private double value;
    private double weight;
    private double space;

    public ArrayList<ArrayList<Double>> getListOfPackage() {
        return listOfPackage;
    }

    static ArrayList<ArrayList<Double>> listOfPackage = new ArrayList<>();

    public Package(double v, double w, double s){
        ArrayList<Double> temp = new ArrayList<>();
        value = v;
        weight = w;
        space = s;
        temp.add(value);
        temp.add(weight);
        temp.add(space);
        listOfPackage.add(temp);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpace() {
        return space;
    }
}
