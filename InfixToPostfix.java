import java.util.Stack;

public class InfixToPostfix {
    //function to return precedence of operators
    static int precedence(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
            return 1;//Low precedence
            case '*':
            case '/':
            return 2;//Medium precedence
            case '^':
            case 3:
            return 3;//high precedence;
        }
        return -1;
    }
    //Function to convert infix to postfix
    public static String convert(String infix)
    {
        StringBuilder postfix=new StringBuilder();//This will store the final postfix expression
        Stack<Character>stack=new Stack<>();//stack to hold operators and parenthesis
        //Loop through each character in infix expression
        for(char ch:infix.toCharArray())
        {
            //If the character is an operand (letter or digit),add it directly to postfix
            if(Character.isLetterOrDigit(ch))
            {
                postfix.append(ch);
            }
            //If the character is an opening parenthesis,push it to stack
            else if(ch=='(')
            {
                stack.push(ch);
            }
            //If its a closing parenthesis,pop from stack until '(' is found
            else if(ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    postfix.append(stack.pop());

                }
                stack.pop();//Remove the '(' from the stack
            }
            else//If its an operator
            {
                //while the stack is not empty and current operaors precedence is less than or equal to the operator of the top of the stack
                while(!stack.isEmpty()&&precedence(ch)<=precedence(stack.peek()))
                {
                    postfix.append(stack.pop());//pop from stack to postfix
                }
                stack.push(ch);//push current operator to stack

            }
        }
        //After reading the entire infix expression ,pop all remaining operators from the stack to postfix
        while(!stack.isEmpty())
        {
            postfix.append(stack.pop());
        }
        return postfix.toString();

        }
        public static void main(String args[])
        {
            String infix="a+(b*c-(d/e^f)*g)*h";
            String postfix=convert(infix);
            System.out.println(postfix);
        }

    
    
}
