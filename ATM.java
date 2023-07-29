import java.util.*;
import java.util.Scanner;

class ATMFuction{
    Scanner sc=new Scanner(System.in);
    long amount;
    long balance;
    void deposit(){
        System.out.println("Enter the amount to deposit: ");
        amount=sc.nextLong();
        balance=balance+amount;
        System.out.println("Total balance in your account is "+balance);
    }
    void withdraw(){
        System.out.println("Enter the amount to withdraw: ");
        amount=sc.nextLong();
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Total balance in your account is "+balance);
        }
        else{
            System.out.println("Enccficent balance to withdraw");
            System.out.println("Total balance in your account is "+balance);
        }
    }
    void checkbalance(){
        System.out.println("Total balance in your account is "+balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*String user={"user1","user2","user3","user4","user4"};
        String pin={"123","234","345","456","567"};*/
        try{
            int a;
            ATMFuction atm=new ATMFuction();
            while(true){
                System.out.println("1.Deposit\n2.WithDraw \n3.CheckBalance\n4.EXIT");
                System.out.print("Enter the Your Choice: ");
                a=sc.nextInt();
                switch (a) {
                    case 1:
                        atm.deposit();
                        break;
                    case 2:
                        atm.withdraw();
                        break;
                    case 3:
                        atm.checkbalance();
                        break;
                    case 4:
                        System.out.println("*******Thank you using our Service********");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter the valid number");
                        break;
            
                    }
            }
        }
        catch(Exception  e){
            System.out.println("Error is "+e);
        }
    }
}
