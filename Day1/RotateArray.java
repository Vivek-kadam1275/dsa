public class RotateArray {
    
     void reverseArray(int[] nums,int start,int end){
        while(start<end){
            int   temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] nums={1, 2, 3, 4, 5};
        int k=2;
   
        
        int start=0;
        int end=nums.length-1;
        
        int len=nums.length;
        if(k>len){
            k=k%len;
        }
       reverseArray(nums,start,end);
        start=0;
        end=k-1;
      reverseArray(nums,start,end);
        start=k;
        end=len-1;
     reverseArray(nums,start,end);

        
        

        
    }
 
}
