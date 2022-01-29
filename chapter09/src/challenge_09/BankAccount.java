package challenge_09;

public abstract class BankAccount {

    private double balance;
    private double number_deposit;
    private double number_withdrawals;
    private double interest_rate;
    protected double servicce_charges;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getNumber_deposit() {
        return number_deposit;
    }

    public void setNumber_deposit(double number_deposit) {
        this.number_deposit = number_deposit;
    }

    public double getNumber_withdrawals() {
        return number_withdrawals;
    }

    public void setNumber_withdrawals(double number_withdrawals) {
        this.number_withdrawals = number_withdrawals;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getServicce_charges() {
        return servicce_charges;
    }

    public void setServicce_charges(double servicce_charges) {
        this.servicce_charges = servicce_charges;
    }

    public BankAccount(double balance, double apr) {
        this.balance = balance;
        this.interest_rate = apr;
    }
    public void deposit(double amount){
        this.balance += amount;
        this.number_deposit++;
    }
    public void withdraw(double amount){
        this.balance -= amount;
        this.number_withdrawals++;
    }
    public void calcInterest(){

        double monthlyInterest = (interest_rate/12);

        monthlyInterest = balance * monthlyInterest;
        this.balance += monthlyInterest;

    }
    public void monthlyProcess(){
        this.balance -= servicce_charges;
        calcInterest();

        this.number_deposit = 0;
        this.number_withdrawals = 0;
        this.servicce_charges = 0;
    }

}
