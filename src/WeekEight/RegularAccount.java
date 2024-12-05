package WeekEight;

public class RegularAccount extends BankAccount{
        int age;
        public RegularAccount(String n, String t, int b, int a) {
            super(n, t, b);
            age = a;
        }
        @Override
    public String toString(){
        String tempStr = "Name:";
        tempStr = tempStr.concat(this.accountHolderName);
        tempStr = tempStr.concat(" Type:");
        tempStr = tempStr.concat(this.accountType);
        tempStr = tempStr.concat( " age:");
        tempStr = tempStr.concat(String.valueOf(this.age));
        tempStr = tempStr.concat( " Balance:$");
        tempStr = tempStr.concat(String.valueOf(this.accountBalance));
        return tempStr;
    }
}
