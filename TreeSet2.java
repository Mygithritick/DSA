import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer>t=new TreeSet<Integer>(Comparator.reverseOrder());
        int []a={6,2,89,24};
        for(int x:a)
        t.add(x);
        System.out.println(t);
    }
    
}
