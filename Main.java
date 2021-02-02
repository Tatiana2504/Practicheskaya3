package com.metanit;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        double a = 7.2;
        double b = 3.9;
        double x1 = -0.38;
        double x2 = 4.19;
        double x3 = 9.13;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        y1 = a*x1 + b*x1*x1;
        y2 = exp(x2) + x2*x2;
        y3 = sin(b*x3);
        if (x1<3) {
            System.out.print(y1);
        }
        else if (x2>= 3 & x2<=6){
            System.out.print(y2);
        }
        else if (x3>6){
            System.out.print(y3);
        }
    }
}
