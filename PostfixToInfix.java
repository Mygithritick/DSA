import java.util.Stack;

public class PostfixToInfix {
    //Function to check if the character is an operator
    static boolean isOperator(char ch)
    {
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^';
    }
    //Function to convert postfix to infix
    static String convertToInfix(String postfix)
    {
        Stack<String>stack=new Stack<>();
        for(int i=0;i<postfix.length();i++)
        {
            char ch=postfix.charAt(i);
            //If operand push it to stack
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            //If operator,pop two elements,form infix and push back
            else if(isOperator(ch))
            {
                String operand2=stack.pop();
                String operand1=stack.pop();
                String expr="("+operand1+" "+ch+" "+operand2+")";
                stack.push(expr);
            }

        }
        //Final result will be the only elements in the stack
        return stack.pop();

    }
    public static void main(String[] args) {
        String postfix="ab+cd*^";
        String infix=convertToInfix(postfix);
        System.out.println(postfix);
        System.out.println(infix);
    }
    
}
