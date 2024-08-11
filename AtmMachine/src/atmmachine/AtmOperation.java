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
public interface AtmOperation {
    
    public void viewBalance();
    public void depositAmount(double depositamount);
    public void withdrawAmount(double withdrawamount);
   
}
