package exception;

public class Account {
    protected double balance;
    public Account(double ba){
        this.balance = ba;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt)throws OverdraftException{
        if(this.balance < amt)
            throw new OverdraftException("余额不足",amt-balance);
        this.balance -= amt;
    }

    public static void main(String[] args) {
        Account a = new Account(100) ;
        a.deposit(20);
        System.out.println(a.getBalance());
        try{
            a.withdraw(200);
        }catch(OverdraftException e){
            System.out.println("透支金额："+e.getDeficit());
            e.printStackTrace();
        }
    }
}
