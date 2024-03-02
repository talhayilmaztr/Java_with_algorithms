
public class Avarage_matrix {
    
    public static void averagebyColumns(int[][] matrix){
       
        double sum = 0;
        double[] average_array = new double[matrix[0].length];
        
        for(int col = 0; col < matrix[0].length; col++){
            // col = 0
            sum = 0;
            for(int row = 0; row < matrix.length; row++){
                sum += matrix[row][col];   
            }
            //System.out.println("Average of the column " + col + ":" + (sum / matrix.length));
            average_array[col] = sum / matrix.length;
        }
        for (double d : average_array) {
            System.out.println(d);
        }
    }
    public static void main(String[] args) {
        
        int[][] matrix = {
                            {9, 8, 7, 1},
                            {5, 3, 2, 1},
                            {6, 6, 7, 1}
                         };
        
        averagebyColumns(matrix);
    }
}
