import java.util.LinkedHashSet;

public class LinkedHasSet1 {
    public static void main(String[] args) {
        String s = "big black bug if sitting on black nose if black dog";
        String[] words = s.split(" ");

        LinkedHashSet<String> hs = new LinkedHashSet<>();

        for (String word : words) {
            hs.add(word); 
        }

        // Print words in insertion order
        for (String word : hs) {
            System.out.print(word + " ");
        }
    }
}
