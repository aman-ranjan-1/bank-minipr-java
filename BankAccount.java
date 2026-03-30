//# Contains account details and banking operations
import java.util.*;
public class BankAccount {
    int AccountNum,passkey ,balance = 0; 
    String AccountNumber;
    String Username ;  
    private static int AccCount = 0;
    Scanner sc = new Scanner(System.in);
    // clearScreen method
    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // account create 
    void CreateAcc(){
        System.out.println("Enter your Name : ");
        Username = sc.nextLine();
        System.out.println("Create a passkey : ");
        passkey = sc.nextInt();
        Random vnum = new Random();
        AccountNum = 100000000 + vnum.nextInt(999999);
        AccountNumber="ACC"+AccountNum;
        clearScreen();
        System.out.println("Your Account Created ");
        System.out.println("Account Number : "+AccountNumber+"  User - "+Username);
        AccCount++;
    }
    // acc count
    static void showAccCount(){
        System.out.println("Total Existing Accounts - "+AccCount);
    }
    // deposit balance
    void DepositBalance(){
        int amount ;
        clearScreen();
        System.out.println();
        System.out.println();
        System.out.println("Enter amount to add to your account : ");
        amount = sc.nextInt();
        if(amount>0){
        balance = balance + amount;
        System.out.println("Hey "+Username+"! Amount deposited successfully.");
        }
        else{
            System.out.println("Invalid Amount to deposit");
        }
    }
    // withdraw balance
    void WithdrawAmount(int pass){
        clearScreen();
        System.out.println();
        System.out.println();
        if(pass == passkey){
            int amount;
            System.out.println("Enter amount to withdraw : ");
            amount = sc.nextInt();
            if(balance > amount && amount > 0){
                balance = balance - amount;
                System.out.println("Amount Withdrawl successfull");
            }
            else if(balance<amount){
                System.out.println("Insufficient Balance .");
            }
            else {
                System.out.println("Invalid Amount");
            }
        }
        else{
            System.out.println("Wrong Passkey entered.");
        }
    
    } 
    // display balance
    void DisplayBalance(int pass){
        clearScreen();
        System.out.println();
        System.out.println();
        if (pass == passkey) {
            System.out.println("Balance : "+balance);
        }
        else{
            System.out.println("Wrong passkey entered.");
        }
    }

}