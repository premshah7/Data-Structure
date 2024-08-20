import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                sum += j;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}