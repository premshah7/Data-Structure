// package DS.DS.LAB-6;

import java.util.Scanner;

public class Swap {
    static void SwapNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("After Swapping num 1 is : " + num1 + " and num 2 is : " + num2);
    }

    public static void main(String[] args) {
        SwapNum();
    }
}
