//5. write a java program to check for balanced parentheses in an expression
import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = sc.nextLine();
        boolean isBalanced = checkBalanced(expression);
        System.out.println("Is the expression balanced? :"+isBalanced);
    }

    public static boolean checkBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        for(char ch: expression.toCharArray()){
            if(ch=='{'||ch =='['||ch=='('){
                stack.push(ch);
            }else if(ch=='}'||ch==']'||ch==')'){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!isMatchingPair(top,ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close){
        return (open=='['&& close==']'||
                open=='{'&& close=='}'||
                open=='('&&close==')');
    }
}
