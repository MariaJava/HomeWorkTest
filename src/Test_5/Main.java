package Test_5;

public class Main {   // 5 задание

    public static void main(String[] args) {

        String[] array = new String[4];

        array[0] = "pear";
        array[1] = "mango";
        array[2] = "banana";
        array[3] = "strawberry";

        for (String i : array) {

            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        System.out.println("Длина массива " + array.length + " ! ");

        int j = array.length;
        do {
            j--;
            System.out.print(array[j] + " ");
            System.out.print(",");

        } while (j > 0);

    }

}



