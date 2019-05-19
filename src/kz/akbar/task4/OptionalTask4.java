package kz.akbar.task4;

import kz.akbar.task4.util.PrintMatrix;
import kz.akbar.util.InputChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OptionalTask4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter dimension of your matrix[][]: ");
        int dimension = InputChecker.inputSingleNumber(br);
        System.out.print("Enter lower number (may be negative): ");
        int lower = InputChecker.inputSingleNumber(br);
        System.out.print("Enter higher number: ");
        int higher = InputChecker.inputSingleNumber(br);
        MatrixSort matrixSort = new MatrixSort(dimension,lower,higher);
        int[][] matrix = matrixSort.getMatrix();
        PrintMatrix.printMatrix(matrix);
        System.out.println("Length of matrix[][]: " + matrix.length);
        System.out.println("--------------Ordering matrix lines by ordered column----------------");
        System.out.print("Which column to order. Choose from 0 to " + (dimension - 1) + ": ");
        int columnNumber = InputChecker.inputSingleNumber(br);
        System.out.println("The column with number " + columnNumber + " after ordering: ");
        System.out.println(Arrays.toString(matrixSort.getOrderedColumn(columnNumber)));
        int[][] sortedMatrix = matrixSort.doSortMatrix(columnNumber);
        System.out.println("The ordered matrix:");
        PrintMatrix.printMatrix(sortedMatrix);
        System.out.println("--------------Longest continual increasing sequence of matrix--------------------");
        MatrixLongestSequence matrixLongestSequence = new MatrixLongestSequence(matrix);
        System.out.println("Matrix in line: ");
        PrintMatrix.printLine(matrixLongestSequence.linearizeMatrix());
        System.out.println("Line with longest sequence:");
        System.out.println(matrixLongestSequence.getLongestSequence());
    }
}
