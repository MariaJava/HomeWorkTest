package Test_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Сколько вам лет?");


        Scanner scan = new Scanner(System.in);

        while (true) {

            int i = scan.nextInt();
            String tru = "Вы можете голосовать!";
            String fal = "Вы не можете голосовать!";
            String b;
            b = (i >= 18) ? tru : fal;
            System.out.println(b);

        }
    }
}
