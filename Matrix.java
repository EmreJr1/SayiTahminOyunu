import java.util.Arrays;
public class Matrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] transposeMatrix = transpose(matrix);

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : transposeMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
