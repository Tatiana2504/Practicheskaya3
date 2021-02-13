package com.metanit;

public class Main {

    public static void main(String[] args) {
        String nums[];
        int a = -1;
        String v;
        int p;
        nums = new String[1];
        nums = Put("0", nums, a = in(a));
        nums = Put("4", nums, a = in(a));
        nums = Put("8", nums, a = in(a));
        nums = Put("5", nums, a = in(a));
        nums = Put("9", nums, a = in(a));

        nums = Put("6", nums, a = in(a));
        nums = Put("485", nums, a = in(a));
        nums = Put("2", nums, a = in(a));
        nums = Put("9", nums, a = in(a));

        System.out.println("_____________");

        v = Get(nums);
        nums = Gets(nums);
        System.out.println(v);
        v = Get(nums);
        nums = Gets(nums);
        System.out.println(v);

        System.out.println("_____________");
        System.out.println(nums.length);
        nums = AllGets(nums);

        System.out.println(nums.length);

        System.out.println("_____________");

        int W[] = new int[nums.length];

        for (p = 0; p < nums.length; p++) {

            W[p] = Integer.parseInt(nums[p]);
        }
        W = insertionSortImperative(W);

        for (p = 0; p < W.length; p++) {
            System.out.println(W[p]);
        }
        System.out.println("_____________СОРТИРОВКА_____________");

        String c[] = new String[2];
        int max = 0, min = 30;
        double B;
        String m;
        for (p = 0; p < 10; p++) {
            B = Math.random() * 30;
            m = (int) a + "";
            if (a > max) {
                max = p;
            }
            if (a < min) {
                min = p;
            }

            c = Put(m, c, p);
        }

        String s;
        s = c[max];
        c[max] = c[min];
        c[min] = s;

        System.out.println("_____________ВЫВОД_____________");
        for (p = 0; p < 10; p++) {
            System.out.println(c[p]);

        }
    }
}