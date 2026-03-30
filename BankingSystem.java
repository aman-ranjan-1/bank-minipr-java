//# Main program with menu-driven interface
import java.util.*;
public class BankingSystem {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //welcome
        System.out.println("----  Welcome to our Bank ----");
        System.out.println("          MINIPR BANK         ");
        System.out.println();
        System.out.println();
        System.out.println();
        boolean run = true;
        BankAccount user = new BankAccount();
        int acc = 0;
        while(run == true){
            System.out.println("1.Create Account : ");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter your choice : ");
            int choice = in.nextInt();

            switch(choice){
                case 1 : 
                   user.CreateAcc();
                   acc++;
                   break;
                case 2 :
                if(acc==1){
                    user.DepositBalance();
                }
                else{
                    System.out.println("First create an account.");
                }
                   break;
                case 3 :
                clearScreen();
                System.out.println();
                System.out.println();
                if(acc==1){
                    System.out.println("Enter your passkey : ");
                    int pass = in.nextInt();
                    user.WithdrawAmount(pass);
                }
                else{
                    System.out.println("Open a Account to withdraw money from your account");
                }
                break;
                case 4 : 
                    clearScreen();
                    System.out.println();
                    System.out.println();
                    if(acc==1){
                        System.out.println("Enter your passkey : ");
                        int pass = in.nextInt();
                        user.DisplayBalance(pass);
                    }
                    else{
                        System.out.println("First Open Your Account.");
                    }
                    break;
                case 5 : 
                   run = false ; 
                   System.out.println("Exiting -- ");
                   break;
                default : 
                   System.out.println("Invalid Choice");
                   break;
            } 
            
        }
        clearScreen();
        in.close();
    }
}
