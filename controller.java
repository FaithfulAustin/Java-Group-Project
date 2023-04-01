import java.util.ArrayList;

public class controller {

    int total_amt =0;
    public boolean deposit(int amt){
        boolean isSuccessful =false;
        if(amt>0){
           total_amt= total_amt+amt;
           isSuccessful=true;
        }
        return isSuccessful;
    }
    public int checkBalance(){
       return total_amt;
    }
    public boolean withdraw(int amt){
        boolean isSuccessful =false;
        if(amt<total_amt){
            total_amt=total_amt-amt;
            isSuccessful=true;

        }

        return isSuccessful;
    }

}
