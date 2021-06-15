package Matrix;


/**
 * Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.
 *
 * 1     2     3     4
 * 5     6     7     8
 * 9    10    11    12
 * 13    14    15    16
 * 17    18    19    20
 *
 * Diagonal or zigzag view of matrix
 * 1
 * 5 2
 * 9 6 3
 * 13 10 7 4
 * 17 14 11 8
 * 18 15 12
 * 19 16
 * 20
 */
public class ZigZagTraversal {

    public static void zigZag(int matrix[][]){
        int i=0;
        while (i < matrix.length){
            int j = 0;
            int k = i;
            while (k >0){
                System.out.print(matrix[k][j] + "  ");
                k--;
                j++;
            }
            i++;
            System.out.println();
        }
        i=1;
        while (i < matrix[0].length){
            int j = matrix[0].length;
            int k = i;
            while (k < matrix[0].length){
                System.out.print(matrix[j][k] + "  ");
                k++;
                j--;
            }
            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

//        for (int i=0 ;i< matrix.length; i++){
//            for (int j=0; j<matrix[i].length; j++){
//                System.out.print(matrix[i][j] + "  ");
//            }
//            System.out.println();
//        }

        zigZag(matrix);
    }
}
