package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();
        int length = str.length();
        System.out.println("Длина строки:" + length);
    }
}
