package kz.akbar.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OptionalTask4 {

    static int checkEnter(BufferedReader br) throws IOException {
        System.out.println("(to exit enter -1): ");
        int input;
        for (; ; ) {
            try {
                input = Integer.parseInt(br.readLine());
                if (input == -1) {
                    System.exit(0);
                } else {
                    break;
                }
            } catch (NumberFormatException exc) {
                System.out.println("Enter only number!");
                continue;
            }
        }
        return input;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter dimension of your matrix[][]: ");
        int dimension = checkEnter(br);
        System.out.print("Enter lower number (may be negative): ");
        int lower = checkEnter(br);
        System.out.print("Enter higher number: ");
        int higher = checkEnter(br);
        MatrixSort matrixSort = new MatrixSort(dimension,lower,higher);
        int[][] matrix = matrixSort.getMatrix();
        matrixSort.printMatrix(matrix);
        System.out.println("Length of matrix[][]: " + matrix.length);
        System.out.print("Which column to order. Choose from 0 to " + (dimension - 1) + ": ");
        int columnNumber = checkEnter(br);
        System.out.println("The column with number " + columnNumber + " after ordering: ");
        System.out.println(Arrays.toString(matrixSort.getOrderedColumn(columnNumber, matrix)));
        int[][] sortedMatrix = matrixSort.sortMatrix(matrix, columnNumber);
        System.out.println("The ordered matrix:");
        matrixSort.printMatrix(sortedMatrix);
    }
}
