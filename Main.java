package com.metanit;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if (n == 5)
        {
            System.out.println("отлично");
        }
        else if (n == 4)
        {
            System.out.println("хорошо");
        }
        else if (n == 3)
        {
            System.out.println("удовлетворительно");
        }
        else if (n == 2)
        {
            System.out.println("неудовлетворительно");
        }
        else
        {
            System.out.println("недопустимое значение");
        }
    }
}
