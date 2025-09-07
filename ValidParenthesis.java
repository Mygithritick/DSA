import java.util.Stack;
public class ValidParenthesis
{
    public static boolean isValid(String s)
    {
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
        if(ch=='('||ch=='{'||ch=='[')
        {
            stack.push(ch);//push opening bracket
        }
        else//check for closing bracket
        {
            if(stack.isEmpty())
            {
                return false;
            }
            char top=stack.pop();
            if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
            {
                return false;
            }

        }
    }
return stack.isEmpty(); //if stack is empty, all brackets were matched correctly
}
public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[]}";

        System.out.println(test1 + " -> " + isValid(test1)); // true
        System.out.println(test2 + " -> " + isValid(test2)); // false
        System.out.println(test3 + " -> " + isValid(test3)); // true
    }
}