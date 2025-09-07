import java.util.Stack;
public class PostfixToPrefix {
    //function to check if a character is operator
    static boolean isOperator(char ch)
    {
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^';
    }
    //function to convert postfix to prefix
    static String convertPostfixToPrefix(String postfix)
    {
        Stack<String>stack=new Stack<>();
        for(int i=0;i<postfix.length();i++)
        {
            char ch=postfix.charAt(i);
            //If character is operand,push to stack
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            else if(isOperator(ch))
            {
                String op2=stack.pop();
                String op1=stack.pop();
                String temp=ch+op1+op2;
                stack.push(temp);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix="ab+c*";
        String prefix=convertPostfixToPrefix(postfix);
        System.out.println(prefix);
    }

    
}
