package part7.methods;

import java.util.Scanner;

public class FunctionExample07 {

    public static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        greet(); // Gọi phương thức greet
    }
}
