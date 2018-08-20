import java.util.Random;
import java.util.Scanner;

public class SumOfAllNumbersInColumn {
    public static void main(String[] args) {
        int[][] array = generateArray();
        displayArray(array);
        int indexOfColumn = enterIndexOfColumnToSum();
        System.out.println("Tổng các số cột thứ " + indexOfColumn + " là: " + sumOfAllNumbersInColumn(indexOfColumn, array));
    }

    private static int sumOfAllNumbersInColumn(int indexOfColumn, int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == indexOfColumn-1) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

    private static int enterIndexOfColumnToSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chỉ số của cột trong mảng:");
        return scanner.nextInt();
    }

    private static void displayArray(int[][] array) {
        System.out.println("Mảng Random:");
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
