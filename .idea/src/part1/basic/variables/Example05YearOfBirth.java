package part1.basic.variables;

import java.util.Scanner;

public class Example05YearOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = sc.nextInt();

        int namHienTai = 2023;
        int namSinh = namHienTai - tuoi;

        System.out.println("Năm sinh của sinh viên là: " + namSinh);

        sc.close();
    }
}

