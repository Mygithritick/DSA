public class WordCount2
{
    public static void main(String args[])
    {
        String str="Java is a powerful language";
        str.trim();
        int wordCount=0;
        boolean inWord=false;
        for(int i=0;;i++)
        {
            try{
                char ch=str.charAt(i);
                if(ch!=' '&&!inWord)
                {
                    inWord=true;
                    wordCount++;
                }
                else if(ch==' ')
                {
                    inWord=false;
                }
            }
            catch(StringIndexOutOfBoundsException e)
            {
                break;
            }
        }
        System.out.println(wordCount);
    }

}