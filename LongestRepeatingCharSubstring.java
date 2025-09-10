public class LongestRepeatingCharSubstring {
    public static void main(String args[])
    {
        String s="aaabbccccd";
        int maxLength=1,current=1,start=0,maxStart=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1)){
            current++;
            maxLength=Math.max(maxLength,current);
            maxStart=start;
            }
            else
            {
                current=1;
                start=i;
            }
        }
        String longestSubstring=s.substring(maxStart, maxStart+maxLength);
        System.out.println(longestSubstring);
            System.out.print(maxLength);


        }
    }
    

