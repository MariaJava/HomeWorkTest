package Test_1_2;

import java.util.Scanner;  // 1 задание switch

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Введите число");
            number = scan.nextInt();

            switch (number) {

                case 1:
                    System.out.println("Вы ввели число 1");
                    break;
                case 2:
                    System.out.println("Вы ввели число 2");
                    break;
                case 3:
                    System.out.println("Вы ввели число 3");
                    break;
                default:
                    System.out.println("Вы ввели число не соответствующие условию");

            }

        }
    }
}

