package Test_6;

public class Main {   // 6 задание

    public static void main(String[] args) {

        int[][] array = {{1, 7, 9, 10}, {5, 2, 2}};

        for (int i = array.length - 1; i >= 0; i--)
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
    }
}



