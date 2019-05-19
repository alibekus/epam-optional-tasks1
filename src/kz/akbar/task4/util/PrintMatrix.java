package kz.akbar.task4.util;

import java.util.Arrays;

public class PrintMatrix {

    public static void printMatrix(int[][] matrix) {
        System.out.println("Your matrix: ");
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void printLine(int[] line){
        System.out.println(Arrays.toString(line));
    }

    public static String matrixToString(int[][] matrix){
        StringBuilder matrixLinesBuilder = new StringBuilder();
        for(int i = 0; i < matrix.length; i++){
            matrixLinesBuilder.append(Arrays.toString(matrix[i])+'\n');
        }
        return matrixLinesBuilder.toString();
    }
}
