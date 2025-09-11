import java.util.HashMap;

public class AnagramChecker {
    public static boolean areAnagram(String str1,String str2) {
        //step 1:if the length are not equal ,they can't be anagram
        if(str1.length()!=str2.length())
        {
return false;
        }
        //step 2: create frequency map(character count)for the first string
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str1.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        //step 3:Loop through the second string to match character frequencies
        for(char ch:str2.toCharArray())
        {
            //if the character is not found in the map,string are not anagrams
            if(!map.containsKey(ch))
            {
                return false;
            }
            //Decrease the frequency count for the character
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }

        }
        //step 4:if the map is empty at the end,it is valid anagram
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String str1="dog";
        String str2="god";
        System.out.println(areAnagram(str1, str2));
    }
    
}
