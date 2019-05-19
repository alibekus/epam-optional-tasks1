package kz.akbar.task4;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixSortTest extends Task4Test {

    private MatrixSort matrixSort;
    private int[][] matrixToSort;
    private int[][] sortedMatrix;
    private int[] columnToOrder;
    private int[] orderedColumn;

    public MatrixSortTest() {
        matrixSort = new MatrixSort(MATRIX_LENGTH, LOWER_NUMBER, HIGHER_NUMBER);
        columnToOrder = new int[MATRIX_LENGTH];
    }

    @Before
    public void setUp() throws Exception {
        matrixToSort = matrixSort.getMatrix();
        sortedMatrix = matrixSort.doSortMatrix(0);
        orderedColumn = matrixSort.getOrderedColumn(0);
        for (int i = 0; i < MATRIX_LENGTH; i++) {
            columnToOrder[i] = matrixToSort[i][0];
        }
    }

    @Test
    public void getOrderedColumn() {
        int[] expectedColumn = columnToOrder;
        Arrays.sort(expectedColumn);
        assertArrayEquals(expectedColumn, orderedColumn);
    }

    @Test
    public void doSortMatrix() {
        int coincidence = 0;
        for (int i = 0; i < MATRIX_LENGTH; i++) {
            for (int j = 0; j < MATRIX_LENGTH; j++) {
                if (Arrays.equals(matrixToSort[i], sortedMatrix[j])) {
                    coincidence++;
                    break;
                }
            }
        }
        assertEquals(coincidence,MATRIX_LENGTH);
    }
}