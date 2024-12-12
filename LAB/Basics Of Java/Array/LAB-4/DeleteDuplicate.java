
import java.util.*;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n= sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element of "+i+" is : ");
            arr[i] = sc.nextInt();
        }

        int num=0,pos;
        int[] newArray = new int[arr.length];
        for(int i=0;i<n; i++){
             newArray[i] = arr[i];
            for(int j=i+1; j<n; j++){
                
                if(arr[i]==arr[j]){
                    pos=j;
                    for(int k=pos; k<n-1; k++){
                        newArray[k] = arr[k+1];
                    }
                }
            }
            int count=0;
            newArray[i] = arr[i];
            if(arr[i]==num){
                count++;
            }
            if(count==1){
                for(int j=i; j<n-1; j++){
                    newArray[j] = arr[j+1];
                }
            }
            
        }
        System.out.println("Updated Array is : ");
        for(int i=0; i<n-1; i++){
            System.out.println(newArray[i]);
        }
    }
}
