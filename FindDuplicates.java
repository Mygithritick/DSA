import java.util.HashMap;

public class FindDuplicates {
    public static void printDuplicates(int arr[]) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);

        }
        //prinnt number with frequency>1
        boolean foundDuplicates=false;
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                System.out.println(key);
                foundDuplicates=true;
            }
        }
        if(!foundDuplicates)
        {
            System.out.println("No duplicate found");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,3,1,1};
        printDuplicates(arr);
    }
    
}
