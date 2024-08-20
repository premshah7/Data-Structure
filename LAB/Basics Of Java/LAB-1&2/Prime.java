
// package Lab1;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int count=0;
       for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                count++;
                break;
            }
       }
       if(count==0){
            System.out.println("Prime");
       }
    }
}
