import java.util.Random;
import java.util.Scanner;

public class SumOfAllNumbersInColumn {
    public static void main(String[] args) {
        int[][] array = generateArray();
        System.out.println("Mảng Random:");
        displayArray(array);
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateArray() {
        int[][] array = new int[getNumberOfColumns()][getNumberOfRows()];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }
        return array;
    }

    private static int getNumberOfColumns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng:");
        return scanner.nextInt();
    }

    private static int getNumberOfRows() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột của mảng:");
        return scanner.nextInt();
    }


}
