// package Lab1;
import java.util.*;

class Factorial{
    int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        Factorial f1 = new Factorial();
        int f = f1.factorial(n);

        System.out.println("factorial of hte number is "+f);
    }
}