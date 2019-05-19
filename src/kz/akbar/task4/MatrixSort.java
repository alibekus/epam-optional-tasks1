package kz.akbar.task4;

import kz.akbar.task4.util.PrintMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class MatrixSort extends Random {
    private static final Logger LOG = Logger.getLogger(MatrixSort.class.getName());
    private int[][] matrix;
    private int[][] sortedMatrix;
    private int count;

    public MatrixSort(int dimension, int lower, int higher) {
        this.sortedMatrix = new int[dimension][dimension];
        this.matrix = initMatrix(dimension, lower, higher);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    private int[][] initMatrix(int dimension, int lower, int higher) {
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            matrix[i] = this.ints(dimension, lower, higher).toArray();
        }
        return matrix;
    }

    int[] getOrderedColumn(int columnNumber) {
        int[] columnToOrder = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            columnToOrder[i] = matrix[i][columnNumber];
        }
//        Arrays.sort(columnToOrder);
        return Arrays.stream(columnToOrder).sorted().toArray();
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

    private int[] minLine(int col) {
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

    int[][] doSortMatrix(int col) {
        LOG.info("Sorting " + PrintMatrix.matrixToString(matrix) + " by column number " + col);
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            sortedMatrix[i] = minLine(col);
            matrix = reduceMatrix(matrix);
        }
        return sortedMatrix;
    }

}
