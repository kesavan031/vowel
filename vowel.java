package javaapplication2;

import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        String n;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER");
        n = s.nextLine();

        if ("a".equals(n) || "e".equals(n) || "i".equals(n) || "O".equals(n) || "u".equals(n)) {
            System.out.println("THE ALPHABET IS VOWEL");
        } else {
            System.out.println(" NOT A VOWEL");
        }
    }
}
