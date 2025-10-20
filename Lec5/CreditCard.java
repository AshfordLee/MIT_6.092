package Lec5;

public class CreditCard{
    private String cardNumber;
    private double expenses;

    public void charge(double amount)
    {
        this.expenses=this.expenses+amount;
    }

    public String getCardNumber(String password)
    {
        if (password.equals("SECRET!3*!"))
        {
            return cardNumber;
        }

        return "jerkface";
    }

}
