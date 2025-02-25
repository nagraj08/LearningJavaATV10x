package Task22Feb25.Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    Bank(String currency, Integer amount){
        this.currency= currency;
        this.amount = amount;
    }
    String getCurrency(){
        return currency;
    }
    void setCurrency(String currency){
        this.currency=currency;
    }
    Integer getAmount(){
        return amount;
    }
    void setAmount(){
        this.amount=amount;
    }
    Integer add(Bank bankname){
        if(bankname.currency.equalsIgnoreCase("INR")){
            return bankname.amount + this.amount;
        }
        else
        try
        {
            throw new CustomException ("Currency Mismatch, Cannot proceed");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
        return 0;
        }

    }

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}