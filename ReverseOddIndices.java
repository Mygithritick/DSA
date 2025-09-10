import java.util.Arrays;

public class ReverseOddIndices {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int left=1;
        int right=arr.length%2==0?arr.length-1:arr.length-2;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left+=2;
            right-=2;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
