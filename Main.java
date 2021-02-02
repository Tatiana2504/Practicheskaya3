package com.metanit;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        double a = 7.5;
        double b = 1.4;
        double x1 = -4.13;
        double x2 = 0.77;
        double y1 = 0;
        double y2 = 0;
        y1 = a - b * b * x1;
        y2 = 1 / (x2 * x2 + exp(Math.log(a)));
        if (x1 <= -3) {
            System.out.print("y1 = " + y1 + "\n");
        }
        if (x2 > -3) {
            System.out.print("y2 = " + y2 + "\n");
        }
    }
    }
