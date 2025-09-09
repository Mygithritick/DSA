import java.util.Arrays;

public class MergeArrays {
    public static void merge(int arr1[],int arr2[])
    {
        int m=arr1.length;
        int n=arr2.length;
        int arr3[]=new int[m+n];
        int count=0;
        for(int i=0;i<arr3.length;i++)
        {
            if(i<=arr1.length-1)
            {
                arr3[i]=arr1[i];
            }
            else
            {
                arr3[i]=arr2[count];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
    public static void main(String[] args) {
        int arr1[]={10,20,30};
        int arr2[]={40,50,60};
        merge(arr1, arr2);
    }
    
}
