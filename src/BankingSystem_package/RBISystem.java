package BankingSystem_package;

public interface RBISystem {

    //RBISystem has the standard functions/methods used by all inferior banks
    public String depositMoney(int money);
    public String withdrawMoney(int money,String password);
    public String checkBalance(String password);
    public double calculatetotalInterest(int time);
}
