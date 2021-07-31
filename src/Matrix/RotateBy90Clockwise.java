package Matrix;

public class RotateBy90Clockwise {
    public static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("BEFORE");
        printMatrix(matrix);
        System.out.println("AFTER TRANSPOSE");
        for (int i=0; i<matrix.length; i++){
            for (int j=i; j<matrix[i].length ; j++){
                if (i != j){
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
        printMatrix(matrix);
        System.out.println("AFTER REVERSE");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length/2 ; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j] = tmp;

            }
        }
        printMatrix(matrix);

    }
}
