package org.beecrowd;

import java.util.Scanner;

public class E_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ^ 2 = %d\n", i, (i * i));
            }
        }
    }
}
