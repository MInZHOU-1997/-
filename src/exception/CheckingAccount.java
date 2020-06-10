package exception;

public class CheckingAccount extends Account{
    private double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance, double protect){
        super(balance);
        this.overdraftProtection = protect;
    }
    @Override
    public void withdraw(double amt)throws OverdraftException{
        if(amt>this.overdraftProtection+this.balance) {
            double deficit = amt - (this.overdraftProtection + this.balance);
            throw new OverdraftException("透支额度超标", deficit);
        }
        this.balance -= amt;
    }

}
