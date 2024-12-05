package WeekEight;

public class BankAccount {
    String accountHolderName;
    String accountType;
    int accountBalance;
    public BankAccount(){
        this.accountHolderName = "";
        this.accountType = "";
        this.accountBalance = 0;
    }
    public BankAccount(String n, String t, int b){
        this.accountHolderName = n;
        this.accountType = t;
        this.accountBalance = b;
    }
    public void getName(){
        System.out.println(this.accountHolderName);
    }
    public void getType(){
        System.out.println(this.accountType);
    }
    public void getBalance(){
        System.out.println(this.accountBalance);
    }
    public void setName(String n){
        this.accountHolderName = n;
    }
    public void setType(String t){
        this.accountType = t;
    }
    public void setBalance(int b){
        this.accountBalance = b;
    }

    public String toString(){
        String tempStr = "Name:";
        tempStr = tempStr.concat(this.accountHolderName);
        tempStr = tempStr.concat(" Type:");
        tempStr = tempStr.concat(this.accountType);
        tempStr = tempStr.concat( " Balance:$");
        tempStr = tempStr.concat(String.valueOf(this.accountBalance));
        return tempStr;
    }
}
