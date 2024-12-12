import java.util.*;

public class InsertElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number that u want : ");
        int num = sc.nextInt();
        System.out.print("Enter position u want to add : ");
        int pos = sc.nextInt();

        int[] newArray = new int[n+1];

        for(int i=0; i<pos; i++){
            newArray[i] = arr[i];
        }
        newArray[pos] = num;
        for(int i=pos; i<n; i++){
            newArray[i+1] = arr[i];
        }
        System.out.println("Updated Array is : ");
        for(int i=0; i<n+1; i++){
            System.out.println(newArray[i]);
        }
        
    }
}