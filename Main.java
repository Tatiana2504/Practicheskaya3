package com.metanit;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String y = reader.readLine();
        int x = Integer.parseInt(y);

        if(x<100){

            System.out.println("less");
        }
        else{

            System.out.println("not less");
        }
    }
}
