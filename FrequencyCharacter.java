public class FrequencyCharacter {
    public static void search(String str)
    {
        char[]ch=str.toCharArray();
        int[]freq=new int[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0' || ch[i]==' ')
            continue;
            freq[i]=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    freq[i]++;
                    ch[j]='0';
                }
            }
            if(ch[i]!='0')
            {
                System.out.println(ch[i]+" "+freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        search("my name is hritick");
    }
    
}
