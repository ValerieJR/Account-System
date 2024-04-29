public class LoanAccount extends Account{
    private double loanLimit;

    private double tempBalance;

    LoanAccount(String accountType, double loanLimit){
        this.AccountType = accountType;
        this.Balance = 0;
        this.loanLimit = loanLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>this.loanLimit - this.Balance){
            System.out.println("Withdrawal exceeds loan limit");
        }
        else if (amount<=loanLimit-this.Balance){
            this.Balance = this.Balance + amount;


        }
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if(this.Balance == 0){
            System.out.println("No balance to pay");
        }
        else if (amount>this.Balance){
            System.out.println("Amount exceeds balance");
        }
        else if (amount<=this.Balance){
            this.Balance = this.Balance + (this.Balance * 0.05);
            this.Balance = this.Balance - amount;
        }
        return false;
    }

    @Override
    public String toString() {
        String content;
        content = "Remaining fund: Open new loan account for more funds" + "\r\n" ;
        content = super.toString() + "\r\n" + content;
        return content;
    }
}
