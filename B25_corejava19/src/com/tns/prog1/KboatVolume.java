package com.tns.prog1;

public class KboatVolume
{
    int volume(int r) {
        int vol =  r * r * r;
        return vol;
    }
    
    double volume(double h, double r) {
        double vol = (22 / 7.0) * r * r * h;
        return vol;
    }
    
    double volume(double l, double b, double h) {
        double vol = l * b * h;
        return vol;
    }
    
    public static void main(String args[]) {
        KboatVolume obj = new KboatVolume();
        System.out.println("Sphere Volume = " + 
            obj.volume(6));
        System.out.println("Cylinder Volume = " + 
            obj.volume(5, 3.5));
        System.out.println("Cuboid Volume = " + 
            obj.volume(7.5, 3.5, 2));
    }
}
