public class DuplicateReplace {
    public static void replace(String str)
    {
        int count=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='@')
            {
                for(int j=i+1;j<ch.length;j++)
                {
                    if(ch[i]==ch[j])
                    {
                        ch[j]='@';
                        count++;
                    }
                }
            }
        }
        char[]res=new char[ch.length-count];
        int k=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='@')
            res[k++]=ch[i];
        }
        System.out.println(new String(res));
    }
    public static void main(String[] args) {
        replace("hellow hi how");
    }
    
}
