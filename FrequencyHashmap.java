import java.util.HashMap;
import java.util.Map;

public class FrequencyHashmap {
    public static void main(String[] args) {
        String str="this is a test this is only test";
        String words[]=str.split("\\s+");
        Map<String,Integer>freqMap=new HashMap<>();
        for(String word:words)
        {
            freqMap.put(word,freqMap.getOrDefault(word, 0)+1);
        }
        //print results
        for(Map.Entry<String,Integer>entry:freqMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    
}
