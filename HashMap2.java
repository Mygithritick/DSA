import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        String str="hello world";
        Map<Character,Integer>freqMap=new HashMap<>();
        for(char c:str.toCharArray())
        {
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

        }
        for(Map.Entry<Character,Integer>entry:freqMap.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


    }
    
}
