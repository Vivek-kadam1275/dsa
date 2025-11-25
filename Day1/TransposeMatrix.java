import java.util.Arrays;
public class TransposeMatrix {
    public static void  main (String[] args) {
        
        int[][]  matrix = {  {1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int rows=matrix.length;
        int cols=matrix[0].length;
        System.out.println( Arrays.toString(matrix));;
        int[][] transpose=new int[cols][rows];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println( Arrays.toString(transpose[0]));
      

    }
}