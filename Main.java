package com.metanit;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if (n < 0)
        {
            System.out.println("недопустимое значение");
        }
        else if (n < 51)
        {
            System.out.println("Разряд F");
        }
        else if (n < 61 )
        {
            System.out.println("Разряд E");
        }
        else if (n < 71)
        {
            System.out.println("Разряд D");
        }
        else if (n < 81)
        {
            System.out.println("Разряд C");
        }
        else if (n < 91)
        {
            System.out.println("Разряд B");
        }

        else if (n <= 100)
        {
            System.out.println("Разряд A");
        }
        else
        {
            System.out.println("недопустимое значение");
        }
    }
}