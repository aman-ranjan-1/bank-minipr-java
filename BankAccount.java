//# Contains account details and banking operations
import java.util.*;
public class BankAccount {
    int AccountNum,passkey ,balance = 0; 
    String Username ;  
    private static int AccCount = 0;
    Scanner sc = new Scanner(System.in);
    void CreateAcc(){
        System.out.println("Enter your Name : ");
        Username = sc.nextLine();
        System.out.println("Create a passkey : ");
        passkey = sc.nextInt();
        Random vnum = new Random();
        AccountNum = 100000000 + vnum.nextInt(999999);
        System.out.println("Your Account Created ");
        System.out.println("Account Number : "+AccountNum+"  User - "+Username);
        AccCount++;
    }
    static void showAccCount(){
        System.out.println("Total Existing Accounts - "+AccCount);
    }
    void DepositBalance(){
        int amount ;
        System.out.println("Enter amount to add to your account : ");
        amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Hey "+Username+"! Amount deposited successfully.");
    }
    void WithdrawAmount(int pass){
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
    void DisplayBalance(int pass){
        if (pass == passkey) {
            System.out.println("Balance : "+balance);
        }
        else{
            System.out.println("Wrong passkey entered.");
        }
    }

}