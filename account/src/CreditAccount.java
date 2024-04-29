public class CreditAccount extends Account {
    private double CreditLimit;

    CreditAccount(String _accountType, double _creditLimit) {
        this.AccountType = _accountType;
        this.Balance = 0;
        this.CreditLimit = _creditLimit;
    }

    @Override
    public boolean deposit(double amount) {
        if (this.Balance <= 0) {
            this.Balance = 0;
            System.out.println("Sorry! No Balance to pay");
            return false;
        } else if (this.Balance < amount) {
            System.out.println("The balance is less than the amount you are trying to pay");
            System.out.println(this.toString());
        } else {
            this.Balance = this.Balance - amount;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if((this.CreditLimit -  this.Balance) >= amount)
        {
            this.Balance = this.Balance + amount;
        }
        else{
            System.out.println("The Amount is greater than the remain balance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String content = "Remaining fund : " + (this.CreditLimit - this.Balance) ;
        content = super.toString() +  "\r\n" +content;
        return content ;
    }
}


