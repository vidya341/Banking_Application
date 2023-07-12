package BankingSystem_package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Which bank do you like to choose");
        System.out.println("Enter 1 for BOI bank,Enter 2 for HDFC bank");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        RBISystem account;
        //account number
        double accountNo = Math.abs(Math.random()*Math.pow(10,9));
        String accNo = String.valueOf(accountNo);
        System.out.println("Enter your password");
        String password = sc.next();
        System.out.println("Enter your Initial balance");
        double ini_balance = sc.nextInt();
        if(option==1)
        {
            //BOI bank
            account = new BOI(accNo,password,ini_balance);
        }
        else {
            //HDFC BANK

            //checking
            account = new HDFC(accNo,password,ini_balance);
        }
        //tasks to perform
        System.out.println("Press 1 to deposit money, Press 2 to withdraw money, Press 3 to check balance, Press 4 to calculate your interest");
        int task_option = sc.nextInt();
        if(task_option==1)
        {
            //deposit
            System.out.println("Enter the amount to deposit");
            int deposit_money = sc.nextInt();
            String deposit_res = account.depositMoney(deposit_money);
            System.out.println(deposit_res);
        }
        else if(task_option==2){
            System.out.println("Enter money to withdraw");
            int withdraw = sc.nextInt();
            System.out.println("Enter your password");
            String user_password = sc.next();
            String withdraw_res = account.withdrawMoney(withdraw,password);
            System.out.println(withdraw_res);

        }
        else if(task_option==3){

            System.out.println("Enter your password");
            String user_password = sc.next();
            String check_res = account.checkBalance(password);
            System.out.println(check_res);

        }
        else {
            System.out.println("Enter time/duration for ROI");
            int duartion = sc.nextInt();
            double ROI_res = account.calculatetotalInterest(duartion);
            System.out.println(ROI_res);

        }
    }
}