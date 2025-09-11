import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        String s="hellooo";
        HashSet<Object>hs=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(!hs.add(c))
            {
                hs.add(c);
            }

        }
        System.out.println(hs);
    }

    
}
