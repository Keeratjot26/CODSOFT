/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

/**
 *
 * @author DELL
 */
public class AtmImplementation implements AtmOperation {
ATM atm = new ATM();

    @Override
    public void depositAmount(double depositamount) {
      System.out.println(depositamount + " deposited successfully!!");  //--> your amount+ deposit + has beeen deposited 
      atm.setbalance(atm.getbalance()+depositamount);
      viewBalance();
    }

    @Override
    public void withdrawAmount(double withdrawamount) {
        if(withdrawamount%500 == 0){
       if(withdrawamount<= atm.getbalance()){
        System.out.println(withdrawamount + " withdrawn successfuly ");
        atm.setbalance(atm.getbalance()-withdrawamount);
        viewBalance();
    }
       else{
           System.out.println("Insufficient Balance!!\n");
       }
    }
        else{
            System.out.println("Insert minimum amount of Rs 500!\nTransaction Fail!!\n");
        }
    }

    @Override
    public void viewBalance() {
    System.out.println("Available Balance is : "+ atm.getbalance()); 
    System.out.println();
    
    }

    
    
}
