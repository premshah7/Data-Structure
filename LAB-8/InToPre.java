import java.util.Scanner;
import java.util.Stack;

public class InToPre {

    public static String inpre(String str) {
        StringBuilder sb = new StringBuilder(str.trim());
        StringBuilder polish = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        stack.push('(');
        sb.append(')');

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                polish.append(ch);
            }
            else if (ch == ')') {
                stack.push(ch);
            } 
            else if (ch == '(') {
                while (stack.peek() != ')') {
                    polish.append(stack.pop());
                }
                stack.pop();
            } 
            else {
                while (!stack.isEmpty() && spres(stack.peek()) > inpres(ch)) {
                    polish.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        return polish.reverse().toString();
    }

    public static int spres(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 0;
        }
    }

    public static int inpres(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix String : ");
        String str = sc.nextLine();
        System.out.println("prefix string is : " + inpre(str));
        sc.close();
    }
}