package part6.strings;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            String stars = ""; // Chuỗi lưu dấu *

            for (int i = 1; i <= N; i++) {
                stars += "*";
                System.out.println(stars);
            }
        }
    }
}
