public class Remove_Vowels {
    public static void main(String args[])
    {
        String s="hello world";
        s=s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s);
    }
    
}
