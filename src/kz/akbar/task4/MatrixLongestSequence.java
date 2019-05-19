package kz.akbar.task4;

import kz.akbar.task4.util.PrintMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MatrixLongestSequence {

    private static final Logger LOG = Logger.getLogger(MatrixLongestSequence.class.getName());
    private int[][] matrix;

    MatrixLongestSequence(int[][] matrix) {
        this.matrix = matrix;
    }

    private List<Integer> getHighestSequence(List<List<Integer>> lists) {
        int size = 0;
        int count = 0;
        for (int i = 0; i < lists.size(); i++) {
            if (size < lists.get(i).size()) {
                size = lists.get(i).size();
                count = i;
            }
        }
        return lists.get(count);
    }

    private List<List<Integer>> getListsOfSequences(int[] numbers) {
        int prev = numbers[0];
        List<Integer> sequenceOfNumbers = new ArrayList<>();
        List<List<Integer>> listsOfSequences = new ArrayList<>();
        for (int i = 1; i < numbers.length; i++) {
            if (prev < numbers[i]) {
                sequenceOfNumbers.add(prev);
                if (i == numbers.length - 1) {
                    sequenceOfNumbers.add(numbers[i]);
                }
            } else {
                sequenceOfNumbers.add(numbers[i]);
                listsOfSequences.add(sequenceOfNumbers);
                sequenceOfNumbers = new ArrayList<>();
            }
            prev = numbers[i];
        }
        return listsOfSequences;
    }

    public int[] linearizeMatrix() {
        int matrixLength = matrix.length;
        int[] matrixNumbers = new int[matrixLength * matrixLength];
        int k = 0;
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                matrixNumbers[k++] = matrix[i][j];
            }
        }
        return matrixNumbers;
    }

    public List<Integer> getLongestSequence() {
        LOG.info("Getting longest continual sequence of numbers from matrix " + PrintMatrix.matrixToString(matrix));
        return getHighestSequence(getListsOfSequences(linearizeMatrix()));
    }

}
