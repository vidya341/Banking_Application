package BankingSystem_package;

public class HDFC implements RBISystem{

    public String AccNo;
    public String passcode;
    public double balance;
    public double RateOfInterest=8.5;


    public HDFC(String AccNo,String passcode,double balance)
    {
        this.AccNo = AccNo;
        this.passcode = passcode;
        this.balance = balance;
    }
    public String depositMoney(int money) {
        if(money>0)
        {
            balance = balance+money;//balance is not the parameter here,so there is no ambiguity
            return "Total of"+money+"is deposited to the account successfully"+"Your current balance is"+balance;
        }
        else
        {
            return "Please add sufficient money(greater than 0 rupees) to the account";
        }
    }

    public String withdrawMoney(int money, String password) {
        if(password.equals(this.passcode))
        {
            balance = balance-money;
            return "Total of"+money+"is withdrawn"+"Your current balance is"+balance;

        }
        else {
            return "Please enter correct password to withdraw the money";
        }
    }

    public String checkBalance(String password) {
        if(password.equals(this.passcode))
        {
            return "Your current balance is"+balance;
        }
        else{
            return "Please enter corrrect password to check the balance";
        }
    }

    public double calculatetotalInterest(int time) {
        double SI = (balance*time*RateOfInterest)/100;
        return SI;
    }
}
