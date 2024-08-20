
import java.util.*;

public class DelSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] ");

            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index where you want to delete a element");
        int del = sc.nextInt();
        int []newarr = new int[size - 1];
        for (int i = 0; i < newarr.length; i++) {
            if (i < del) {
                newarr[i] = arr[i];
            } else {
                newarr[i] = arr[i + 1];
            }
        }

        System.out.println("New array");
        for (int i = 0; i < newarr.length; i++) {
            System.out.println("newarr[" + i + "] = " + newarr[i]);

        }

    }
}
