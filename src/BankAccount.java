public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum){
        amount += sum;
    }
    public void withDraw(double sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("нехватает денег", amount);
        }
        amount -= sum;
    }
}
