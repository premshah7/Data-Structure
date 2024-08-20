import java.util.Scanner;
class Bank_Account {
    int accountNo;
    int accountBalance;
    String userName;
    String email;
    String accountType;
    

    void getAccountDetails() {
        Scanner as = new Scanner(System.in);
        System.out.print("Enter your account no. : ");
        accountNo = as.nextInt();
        as.nextLine(); 

        System.out.print("Enter your name : ");
        userName = as.nextLine();

        System.out.print("Enter balance : ");
        accountBalance = as.nextInt();
        
    }

    public int Deposit() {
        return (accountBalance+=accountBalance);
    }
}
public class BankAc {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.Deposit();    
    }
}


