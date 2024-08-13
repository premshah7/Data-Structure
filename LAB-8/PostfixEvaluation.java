import java.util.*;

public class PostfixEvaluation {
    static int evalPostfix(String exp){
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                st.push(ch - '0');//ASCII value (ASCII val of ch - ASCII val of 0)
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();

                if(ch == '+') st.push(val1 + val2);
                else if(ch == '-') st.push(val2 - val1);
                else if(ch == '*') st.push(val1 * val2);
                else if(ch == '/') st.push(val2 / val1);
            }
        }

        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter postfix expression: ");
        String exp = sc.nextLine();
        System.out.print("Answer: "+ evalPostfix(exp));
    }
}