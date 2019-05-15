package kz.akbar.task4;

import java.util.Arrays;
import java.util.Random;

public class MatrixSort extends Random {

    private int[][] matrix;
    private int[][] sortedMatrix;
    private int count;

    public MatrixSort(int dimension, int lower, int higher) {
        this.sortedMatrix = new int[dimension][dimension];
        this.matrix = initMatrix(dimension,lower,higher);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    void printMatrix(int[][] matrix) {
        System.out.println("Your matrix: ");
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

    private int[][] initMatrix(int dimension, int lower, int higher) {
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            matrix[i] = this.ints(dimension, lower, higher).toArray();
        }
        return matrix;
    }

    int[] getOrderedColumn(int column, int[][] matrix) {
        int[] columnToOrder = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            columnToOrder[i] = matrix[i][column];
        }
        int[] orderedColumn = Arrays.stream(columnToOrder).sorted().toArray();
        return orderedColumn;
    }

    private int[][] reduceMatrix(int[][] matrix) {
        int length = matrix.length;
        int[][] reducedMatrix = new int[length - 1][length - 1];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == count) {
                continue;
            }
            reducedMatrix[j++] = matrix[i];
        }
        return reducedMatrix;
    }

    private int[] minLine(int[][] matrix, int col) {
        count = 0;
        int number = matrix[0][col];
        for (int i = 1; i < matrix.length; i++) {
            if (number > matrix[i][col]) {
                number = matrix[i][col];
                count = i;
            }
        }
        return matrix[count];
    }

    int[][] sortMatrix(int[][] matrix, int col) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            sortedMatrix[i] = minLine(matrix, col);
            matrix = reduceMatrix(matrix);
        }
        return sortedMatrix;
    }

}
