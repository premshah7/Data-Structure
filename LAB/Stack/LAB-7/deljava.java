import java.util.Stack;
import java.util.Scanner;

public class deljava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        char[] sa = s.toCharArray();
        int i = 0;
        while (1==1) {
            if(sa[i]=='C' || sa[i] == 'c'){
                break;
            }
            st.push(sa[i]);
            i++;
        }
        i++;

        boolean isPalindrome = true;
        while (i < sa.length) {
            if (st.pop() != sa[i]) {
                isPalindrome = false;
            }
            i++;
        }
        

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}