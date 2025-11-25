public class Matric_RC_sum {
    public static void main(String[] args){
       int[][] matrix = {  {3, 7, 2},    // Row 0: sum = 12
                            {9, 1, 8}     // Row 1: sum = 18 (max row)    
                        };   

        int maxRow=0;
        int maxCol=0;
        
        int maxSum=Integer.MIN_VALUE;
        for(int row=0;row<matrix.length;row++){
            int sum=0;
            for(int col=0;col<matrix[row].length;col++){
                sum+=matrix[row][col];
            }
            if(sum>maxSum){
                maxSum=sum;
                maxRow=row;
            }
        }
        maxSum=Integer.MIN_VALUE;
        for(int col=0;col<matrix[0].length;col++){
            int sum=0;
            for(int row=0;row<matrix.length;row++){
                sum+=matrix[row][col];

            }
             if(sum>maxSum){
                maxSum=sum;
                maxCol=col;
            }
        }

        System.out.println("max row-col : "+maxRow+" "+maxCol);

    }
    
}
