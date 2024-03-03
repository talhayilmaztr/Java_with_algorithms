public class Matrix {
    // Method to calculate the sum of the main diagonal and cross diagonal in a matrix
    public static void sum_diagonal_cross_diagonal(int[][] matrix) {
        int sum_diagonal = 0;  // Variable to store the sum of the main diagonal
        int sum_cross_diagonal = 0;  // Variable to store the sum of the cross diagonal

        // Iterate through rows
        for (int row = 0; row < matrix.length; row++) {
            // Iterate through columns
            for (int col = 0; col < matrix[row].length; col++) {
                // Check if the current position is on the main diagonal
                if (row == col)
                    sum_diagonal += matrix[row][col];
                // Check if the current position is on the cross diagonal
                if (col + row == matrix.length - 1)
                    sum_cross_diagonal += matrix[row][col];
            }
        }
        // Additional loop to sum the main diagonal and cross diagonal elements
        for (int row = 0; row < matrix.length; row++) {
            sum_diagonal += matrix[row][row];
        
            // Calculate the column number for the cross diagonal
            int nbr_col = matrix[row].length;
            sum_cross_diagonal += matrix[row][nbr_col - row - 1];
        }
        System.out.println("Diagonal Sum: " + sum_diagonal);
        System.out.println("Cross Diagonal Sum: " + sum_cross_diagonal);
    }
    // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        // Create a new matrix with swapped rows and columns
        int[][] transposed = new int[matrix.length][matrix[0].length];
        // Iterate through rows
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through columns
            for (int j = 0; j < matrix[i].length; j++) {
                // Swap rows and columns to transpose the matrix
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;  
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 7, 8, 3},
            {5, 3, 2, 1},
            {7, 2, 7, 8},
            {4, 1, 8, 9},
        };
        int[][] transposedMatrix = transpose(matrix);
        
        // Call the method to calculate diagonal sums
        sum_diagonal_cross_diagonal(matrix);

        System.out.println("Transposed matrix: ");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
