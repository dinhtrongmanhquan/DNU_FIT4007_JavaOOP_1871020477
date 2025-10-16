package part4.loops;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương hoặc 0.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
            System.out.println(N + "! = " + factorial);
        }
    }
}
