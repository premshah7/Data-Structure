
import java.util.*;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minpos=0,maxpos=0;

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]>arr[maxpos]){
                maxpos = i;
            }
            if(arr[i]<arr[minpos]){
                minpos = i;
            }
        }
        System.out.println("Min element is at"+(minpos+1));
        System.out.println("Max element is at"+(maxpos+1));

    }
}
