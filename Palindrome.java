public class Palindrome {
    public static boolean isPalindrome(String word)
    {
        word=word.toLowerCase();
        int i=0,j=word.length()-1;
        while(i<j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void longestPalindrome(){
        String str="This is a level racecar noon civic string that contains madam and refer";
        String words[]=str.split(" ");
        String longestPalindrome="";
        for(String word:words)
        {
            if(isPalindrome(word))
            {
                if(word.length()>longestPalindrome.length())
                {
                    longestPalindrome=word;
                }
            }
        }
        System.out.println(longestPalindrome);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        longestPalindrome();
    }
    
}
