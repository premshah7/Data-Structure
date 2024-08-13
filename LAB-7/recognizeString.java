import java.util.*;

public class recognizeString {
    int top = -1;
    int n;
  
    char[] arr;

    recognizeString(int n) {
        this.n = n;
        arr = new char[n];
    }

    public void push(char x) {
        if (top >= (n - 1)) {
          System.out.println("stack overflow");
        } else {
          top += 1;
          arr[top] = x;
        }
    }

    public void pop() {
        if (top <= 0) {
          System.out.println("stack underflow");
        } else {
          top -= 1;
        }
    }

    public char peep() {
        return arr[top];
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char[] arr1 = toCharArray(str);
        int n = str.length();
        recognizeString s = new recognizeString(n);
        int i = 0;

        while (str.charAt(i) != 'c') {
            s.push(str.charAt(i));
            i++;
        }
        
        boolean flag = true;

        for (int j = (i + 1); j < n; j++) {
            char ch = s.peep();

            if (ch != str.charAt(j)) {
                s.pop();
                flag = false;
                System.out.println("invalid string");
                break;
            }
            }
            if (flag) {
                System.out.println("Valid string");
        }
    }
}