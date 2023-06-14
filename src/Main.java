public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);
        account.deposit(15000.0);
        try {
            while (true) {
                account.withDraw(6000.0);
                System.out.println("вычтено 6000");
            }
        } catch (LimitException e) {
            System.out.println( e.getMessage());
            Double remainingAmount = e.getRemainingAmount();
            try {
                account.withDraw(remainingAmount);
            } catch (LimitException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("осталось " + remainingAmount);
        }
    }
}