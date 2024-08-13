
import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int sum=0;
        double avg;

        for(int i=1; i<=n; i++){
            sum+=i;
        }
        avg = sum/(double)n;
        System.out.println(avg);
    }
}
