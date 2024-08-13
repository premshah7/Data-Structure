
// package Lab1;
import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char to check its vowel or consonant : ");
        char ch = sc.nextLine().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not a vowel");
        }


    }
}
