import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str="aaabbbcccd";
        Map<Character,Integer>freqMap=new HashMap<>();
         for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for(char c:str.toCharArray())
        {
            if(freqMap.get(c)==1)
            {
                System.out.println(c);
                return;
            }
        }
        System.out.println("no non repeating character found");

    }
    
}
