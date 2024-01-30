package Homework;

import java.util.Scanner;

public class JavaInputTrArea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int ha = Integer.parseInt(scanner.nextLine());
        int result = (a * ha) / 2;
        System.out.println(result);
    }
}
