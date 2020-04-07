package com.company;

import java.util.Scanner; // 1 задание if

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i;
        while (true) {
            System.out.println("Введите число");
            i = scan.nextInt();
            if (i == 1) {
                System.out.println("Вы ввели число 1");
            } else if (i == 2) {
                System.out.println("Вы ввели число 2");

            } else if (i == 3) {
                System.out.println("Вы ввели число 3");
            } else {
                System.out.println("Вы ввели число не соответствующие условию");
            }

        }
    }
}
