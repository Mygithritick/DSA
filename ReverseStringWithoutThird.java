public class ReverseStringWithoutThird {
    public static void reverse(String s)
    {
        char ch[]=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end)
        {
            ch[start]=(char)(ch[start]^ch[end]);
            ch[end]=(char)(ch[start]^ch[end]);
            ch[start]=(char)(ch[start]^ch[end]);
            start++;
            end--;
        }
        System.out.println(new String(ch));


    }
    public static void main(String[] args) {
        reverse("hello hi are you");
    }
}
