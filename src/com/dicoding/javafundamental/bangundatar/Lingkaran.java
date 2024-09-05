package com.dicoding.javafundamental.bangundatar;

public class Lingkaran implements rumusBangunDatar{

    private final double pi = 3.14;

    public Lingkaran(){
        
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    
    public double luas(int r) { 
        return (pi * r * r);
    }
    public double keliling(int r) { 
        return (2 * pi * r);
    }
}
