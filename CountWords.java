public class CountWords {
    public static void count(String str)
    {
        int count1=0;
        for(int i=0;i<str.length();i++)
        {
            if((i==0 && str.charAt(i)!=' ')||(str.charAt(i)!=' '&& str.charAt(i-1)==' '))
            {
                count1++;

            }
        }
        System.out.println(count1);
    }
    public static void main(String[] args) {
        String str="hello hi how are you";
        count(str);
    }
}
