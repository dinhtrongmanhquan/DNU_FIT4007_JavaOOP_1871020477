package part6.strings;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("Chuỗi là pangram.");
        } else {
            System.out.println("Chuỗi không phải pangram.");
        }
    }
}
