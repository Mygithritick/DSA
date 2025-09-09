public class ReverseWords {
    public static void main(String args[])
    {
        String str="Java is powerful";
        String words[]=str.split(" ");
        String result="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String reversedWord="";
            for(int j=word.length()-1;j>=0;j--)
            {
                reversedWord+=word.charAt(j);
            }
            result+=reversedWord+" ";

        }
        System.out.println(result.trim());
    }

    
}
