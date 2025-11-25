import java.util.Arrays;
public class BubbleSort {



    public static void main (String [] args){
        int[] arr={10,2,3,4,5};
        int temp=0;
        int n=arr.length;
        // use flag for not traversing for sorted arrays, saves time
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;  
                   flag=true;
                  System.out.println("count");
                } 
            }
            if(!flag){
                System.out.println("in break");
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
        
    }

    
}
