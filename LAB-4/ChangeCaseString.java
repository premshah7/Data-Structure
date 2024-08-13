
import java.util.*;

public class ChangeCaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        StringBuilder s = new StringBuilder();

        char[] ch = str.toCharArray();
        for(int i=0; i< ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                s.append(Character.toLowerCase(ch[i]));
            }
            else if(Character.isLowerCase(ch[i])){
                s.append(Character.toUpperCase(ch[i]));
            }
            else{
                s.append(ch[i]);
            }
        }

        System.out.print(s);
    }
}
