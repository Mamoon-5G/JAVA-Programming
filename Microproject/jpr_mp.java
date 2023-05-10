package Microproject;

import java.io.*;
import java.util.*;
public class jpr_mp
{
    public static void main(String args[] )
    { 
        int balance = 10000, withdraw, deposit, ch;
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t\t*****************************");
        System.out.println("\t\t\t\t  ATM Transaction Interface");
        System.out.println("\t\t\t\t*****************************");
        System.out.println("\t\t\t\t20461 Siddiqui Mamoon");
        System.out.println("\t\t\t\t20463 Waghoo Rehan");
        System.out.println("\t\t\t\t20481 Bhot Sai");
        System.out.println("\t\t\t\t20482 Khobragade Ashish");
        System.out.println("\t\t\t\t*****************************");
        while(true)
        {
            System.out.println("\nAutomated Teller Machine\n");
            System.out.println("Choose 1 for Withdraw\n");
            System.out.println("Choose 2 for Deposit\n");
            System.out.println("Choose 3 for Check Balance\n");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation you want to perform: \n");
            ch = s.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:\n");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:\n");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}