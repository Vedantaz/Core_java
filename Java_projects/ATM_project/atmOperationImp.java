import java.util.*;
                       
public class atmOperationImp implements atmOperationInterface{ 
    ATM atm = new ATM();
    Map<Double, String> ministmt;
    @Override
    public void viewBalance(){
        System.out.println("Available Balance : " + atm.getBalance());
        
    }
    @Override  // %500 means  = 500 ka multiple
    public void withdrawAmount(double withdrawAmount){
        if ((withdrawAmount % 500) && (withdrawAmount < atm.getBalance())){
            ministmt.put(withdrawAmount + "Amount withdrawn. ");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
            System.out.println("Collect the cash " + withdrawAmount );
        }
        else if (atm.getBalance() < withdrawAmount){
            System.out.println("Insuffiecient Balance in your Bank..");
            System.out.println("Please enter the amount in multiple of 500");
            
            
        }
        

        

    }
    @Override
    public void depositAmount(double depositAmount){
        ministmt.put(depositAmount, "Amount deposited. ");
        System.out.println(depositAmount + "deposited successfullly !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
        

    }
    @Override
    public void viewMiniStatement(){
            for (Map.Entry<Double, String> m:ministmt.entrySet()){
                System.out.println(m.getKey() + "" + m.getValue());
                
            }
    }
    
    
    public static void main(String args[]) {
           System.out.println();
                            
      }
}
