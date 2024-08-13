

import java.util.*;

public class ReadDsiplayElements{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
