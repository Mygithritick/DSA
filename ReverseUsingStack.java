import java.util.Stack;

public class ReverseUsingStack {
    public static void reverse(String s)
    {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            st.push(c);
        }
        String res="";
        while(!st.isEmpty())
        {
            res=res+st.pop();
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String s="hello hi are you";
        reverse(s);
    }
    
}
