package part5.arrays;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // Tạo mảng 5 phần tử

        System.out.println("Nhập 5 số nguyên:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
