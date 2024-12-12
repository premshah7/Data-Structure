
import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum=0;
        for(int i=m; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
