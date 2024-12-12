
import java.util.*;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         
        int count=0;
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println("Contains a duplicate");
                    break;
                }
            }
    
        }
        if(count==0){
            System.out.println("Doesn't contain a duplicate number");
        }
    }
}
