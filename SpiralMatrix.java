import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int[] elements = new int[n * n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n * n; i++) {
            elements[i] = sc.nextInt();
        }

        int startRow = 0, endRow = n - 1, startCol = 0, endCol = n - 1;
        int index = 0;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = elements[index++];
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = elements[index++];
            }
            endCol--;

            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    matrix[endRow][i] = elements[index++];
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = elements[index++];
                }
                startCol++;
            }
        }

        System.out.println("Spiral matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
