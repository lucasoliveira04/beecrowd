package org.beecrowd;

import java.util.Scanner;

public class E_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.printf("%.1f\n", media);
        }
    }
}
