// package Lab1;
import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x =sc.nextInt();
        System.out.print("Enter a power : ");
        int y = sc.nextInt();
        int mul=1;
        for(int i=1; i<=y; i++){
            mul*=x;
        }
        System.out.println(mul);
    }
}