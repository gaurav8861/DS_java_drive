package Matrix;

public class SpiralMatrix {

    public static void main(String[] args) {

        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        boolean is_break = false;

        for (int i=0 ;i< a.length;i++){
            for (int j=0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
                if(a.length-1==j){
                    is_break = true;
                    break;
                }
            }
            System.out.println();
            if (is_break){
                i = 0;
            }
        }
    }
}
