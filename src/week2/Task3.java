package week2;

import java.awt.geom.PathIterator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        float PI = 3.14159f;
        double k = 2 * r * PI;
        double z = Math.pow(r, 2) * PI;
        System.out.println("area - " + k + " " +  " perimetr-" + z);

    }

}
