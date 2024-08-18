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
public class AtmMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AtmOperation op = new AtmImplementation();
        int atmnum = 123456;
        int pin = 1234;
        System.out.println("Welcome to the ATM!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ATM Number:");
        int atmNum = sc.nextInt();
        System.out.print("Enter the ATM pin: ");
        int pinNum = sc.nextInt();
        
        if((atmnum == atmNum) && (pin == pinNum )){
           
            while(true){
             int ch ;
             System.out.println("1.Check Your Balance\n2.Deposit Amount\n3.Withdraw Amount\n4.Exit the menu");
             System.out.print("Choose an option:");
             ch = sc.nextInt();
             switch(ch){
                 case 1:
                 {
                    op.viewBalance();
                    break;
                 }  
                   
                 case 2:
                 {
                     System.out.print("Enter the amount to be Deposited: ");
                     double depositamount = sc.nextDouble();
                     op.depositAmount(depositamount);
                     break;
                 }
                     
                 case 3 :
                 {
                     System.out.print("Enter the amount to be Withdrawn: ");
                     double withdrawamount = sc.nextDouble();
                     op.withdrawAmount(withdrawamount);
                     break;
                 }
                 case 4 :
                 {
                     System.out.println("Collect your ATM Card!\nThankyou for using the ATM Machine! ");
                     System.exit(0);
                 }
                     
             }
            
            }
            
            
        }
        else{
            System.out.println("Incorrect Credentials!!");
          
        }
       
    }
    
}
