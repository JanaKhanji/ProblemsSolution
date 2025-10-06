// https://www.hackerrank.com/challenges/balanced-brackets/problem
import java.util.*;

class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return "NO";
               char lastIn = st.pop();
               if ((c == '}' && lastIn != '{')
                    || (c == ']' && lastIn != '[')  
                    || (c == ')' && lastIn != '(')  
               ) { return "NO"; }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }


        
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));

    }
}
