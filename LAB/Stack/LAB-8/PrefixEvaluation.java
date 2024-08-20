import java.util.*;

public class PrefixEvaluation {
    static int evalPrefix(String exp){
        Stack<Integer> st = new Stack<>();
            
        for(int i=(exp.length()-1); i>=0 ; i--){
                char ch = exp.charAt(i);
            
                if(Character.isDigit(ch)){
                    st.push(ch - '0');//ASCII value (ASCII val of ch - ASCII val of 0)
                }
                
                else{
                    int val1 = st.pop();
                    int val2 = st.pop();
            
                    if(ch == '+') st.push(val1 + val2);
                    else if(ch == '-') st.push(val1 - val2);
                    else if(ch == '*') st.push(val1 * val2);
                    else if(ch == '/') st.push(val1 / val2);
                }
            }
            return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter prefix exp: ");
        String exp = sc.nextLine();
        System.out.print("Answer: " + evalPrefix(exp));
    }
}