/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ATM {
   private double balance;
   private double withdrawamount;
   private double depositamount;
   
   public ATM(){
       //DEFAULT CONSTRUCTOR
   }
   
   public double getbalance(){
    return balance;   
   }
   public double withdraw(){
      return withdrawamount;
   }
   public double deposit(){
       return depositamount;
   }

    public double setbalance(double balance) {
      this.balance = balance;
      return balance;
    }

    

}
