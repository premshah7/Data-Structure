import java.util.*;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int[][] arr2 = new int[2][2];
        System.out.println("Matrix 1 is : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 2 is : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[2][2];
        System.out.println("Sum of matrix  is : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                sum[i][j] = arr[i][j]+arr2[i][j];
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}