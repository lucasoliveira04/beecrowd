package org.beecrowd;

import java.util.Scanner;

public class E_2160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s.length() <= 80){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
