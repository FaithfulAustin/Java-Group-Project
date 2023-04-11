
//CONTROLLER CLASS: Responsible for handling changes in the flow of data
public class Controller {
    long total_amt =0;

    //Deposit method for adding the deposited money to the total balance
    public boolean deposit(long amt){
        boolean isSuccessful =false;
        if(amt>0){
           total_amt= total_amt+amt;
           isSuccessful=true;
        }
        return isSuccessful;
    }
    //Method for displaying the total balance in the account
    public long checkBalance(){
       return total_amt;
    }

    //Withdraw method for removing the withdrawn money from the total balance
    public boolean withdraw(long amt){
        boolean isSuccessful =false;
        if(amt<total_amt && amt>0){
            total_amt=total_amt-amt;
            isSuccessful=true;

        }

        return isSuccessful;
    }

}
