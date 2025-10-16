package part6.strings;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("Chuỗi sau khi in hoa: " + upperStr);
    }
}
