package com.company;

import java.util.Arrays;

public class ArrayList implements List {
    private int lenght;
    private double[] elements;

    public ArrayList() {
        elements = new double[10];
        lenght = 0;
    }

    @Override
    public void add(double a) {
        if(elements.length == lenght) {
            double[] temp = new double[lenght+1];
            System.arraycopy(elements, 0, temp, 0, lenght);
            elements = temp;
        }

        elements[lenght] = a;
        ++lenght;
    }

    @Override
    public double get(int i) {
        if(i >= lenght || i <0){
            throw new IndexOutOfBoundsException("can't find index " + i + "lenghr = " + lenght);
        }
        return elements[i];
    }

    @Override
    public void remove(int pos) {
        if(pos >= lenght || pos <0){
            throw new IndexOutOfBoundsException("can't find index " + pos + "lenghr = " + lenght);
        }
        for (int i = pos; i < lenght - 1; ++i) {
            elements[i] = elements [i+1];
        }
        --lenght;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
