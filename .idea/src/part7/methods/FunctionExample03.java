package part7.methods;

import java.util.Scanner;

public class FunctionExample03 {

    public static boolean isNatural(int n) {
        return n >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();

        if (isNatural(num)) {
            System.out.println(num + " là số tự nhiên.");
        } else {
            System.out.println(num + " không phải là số tự nhiên.");
        }
    }
}
