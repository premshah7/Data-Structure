import java.util.*;
public class Counta_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        char[] sa = str.toCharArray();
        Stack<Character>sta = new Stack<>();
        Stack<Character>stb = new Stack<>();

        for (int i = 0; i < sa.length; i++) {
            if (sa[i] == 'a' || sa[i] == 'A') {
                sta.push(sa[i]);
            }
            else if(sa[i] == 'b' || sa[i] == 'B'){
                stb.push(sa[i]);
            }
        }
        
        if (sta.size() == stb.size()) {
            System.out.println("Yesss");
        }
        else{
            System.out.println("So Soryyyyy");
        }
    }
}
