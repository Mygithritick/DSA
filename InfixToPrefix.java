import java.util.Stack;
public class InfixToPrefix {
    //Function to check if the character is an operator
    static boolean isOperator(char c)
    {
        return c=='+'||c=='-'||c=='*'||c=='^'||c=='/';
    }
    //Function to get precedence of operators
    static int getPrecedence(char op)
    {
        switch (op) {
            case'+':
            case'-':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;//highest precedence
        }
        return -1;//for non operators
    }
    //function to reverse and swap brackets
    public static String reverseAndSwap(String expression)
    {
        StringBuilder reversed=new StringBuilder();
        for(int i=expression.length()-1;i>=0;i--)
        {
            char c=expression.charAt(i);
            //swap brackets
            if(c=='(')
            {
                reversed.append(')');
            }
            else if(c==')')
            {
                reversed.append('(');
            }
            else {
                reversed.append(c);//for other characters as it is
            }
        }
        return reversed.toString();
    }
    //Function to convert infix expression to postfix expression using a stack
    static String infixToPostfix(String expression)
    {
        Stack<Character>stack=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(char c:expression.toCharArray())
        {
            //If character is operand
            if(Character.isLetterOrDigit(c))
            {
                result.append(c);
            }
            //If opening brackets,push it into stack
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')'){

            while(!stack.isEmpty() && stack.peek()!='(') 
            {
                result.append(stack.pop());
            }
            stack.pop();
        }
        //If operator
        else if(isOperator(c))
        {
            while(!stack.isEmpty() && (getPrecedence(c)<getPrecedence(stack.peek())||(getPrecedence(c)==getPrecedence(stack.peek()) && c!='^')))
            {
                result.append(stack.pop());

            }
            //push current operator to stack
            stack.push(c);

        }

    }
    //pop all remaining operator to stack
    while(!stack.isEmpty())
    {
        result.append(stack.pop());
    }
    return result.toString();
    
}
//Function to convert infix to prefix
static String infixToPrefix(String infix)
{
    //Reverse the infix and swap brackets
    String reversed =reverseAndSwap(infix);
    //convert to postfix
    String postfix=infixToPostfix(reversed);
    //reverse postfix to get final prefix expression
    return new StringBuilder(postfix).reverse().toString();
}
public static void main(String[] args) {
    String infix="(A-B/C)*(A/K-L)";
    String prefix=infixToPrefix(infix);//convert infix to prefix
    System.out.println(prefix);
}
}