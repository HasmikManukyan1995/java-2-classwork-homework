package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        short b = a;
        System.out.println(a);

        //2
        short k = scan.nextShort();
        int z = k;
        System.out.println(k);

        //3
        int d = scan.nextInt();
        int l = d;
        System.out.println(d);

        //4
        long q = scan.nextLong();
        long m = q;
        System.out.println(q);

        //5
        float e = scan.nextFloat();
        float p = e;
        System.out.println(e);
    }

}

