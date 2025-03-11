import java.util.Stack;

public class ValidParenthese{

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(') stk.push(')');
            else if(c=='{') stk.push('}');
            else if(c=='[') stk.push(']');
            else if(stk.isEmpty() || stk.pop()!=c) return false;
        }
        return stk.isEmpty();
    }

    public static void main(String[] args){
        String s = "([)"; 
        System.out.println(isValid(s));
    }
}