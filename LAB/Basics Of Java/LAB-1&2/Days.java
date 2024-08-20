import java.util.*;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year, week, days;
        year = n/365;
        n%=365;
        week=n/7;
        days=n%7;
        System.out.println(year+" year "+week+" weeks "+days+" days ");
    }
}