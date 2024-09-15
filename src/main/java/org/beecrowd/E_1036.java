package org.beecrowd;

import java.util.Scanner;

public class E_1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1, x2, delta;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

       if (delta < 0 || a == 0){
           System.out.println("Impossivel calcular");
       } else {
           x1 = (-b + Math.sqrt(delta)) / (2 * a);
           x2 = (-b - Math.sqrt(delta)) / (2 * a);

           System.out.printf("R1 = %.5f\n", x1);
           System.out.printf("R2 = %.5f\n", x2);
       }


    }
}
