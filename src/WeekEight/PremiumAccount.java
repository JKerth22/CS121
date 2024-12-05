package WeekEight;

public class PremiumAccount extends BankAccount{
    int creditLimit;
    public PremiumAccount(String n, String t, int b, int a) {
        super(n, t, b);
        creditLimit = a;
    }
    @Override
    public String toString(){
        String tempStr = "Name:";
        tempStr = tempStr.concat(this.accountHolderName);
        tempStr = tempStr.concat(" Type:");
        tempStr = tempStr.concat(this.accountType);
        tempStr = tempStr.concat( " Credit Limit:");
        tempStr = tempStr.concat(String.valueOf(this.creditLimit));
        tempStr = tempStr.concat( " Balance:$");
        tempStr = tempStr.concat(String.valueOf(this.accountBalance));
        return tempStr;
    }
}

