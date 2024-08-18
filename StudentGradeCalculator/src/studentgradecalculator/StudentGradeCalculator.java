/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradecalculator;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Subjects: ");
        int numS = sc.nextInt();
        int marks[] = new int [numS];// Array marks[] stores marks obtained in each subject; // numS --> number of subjects 
        int total = 0;
         
        for(int i = 0; i < numS ;i++){
           
           System.out.println("Enter marks of Subject "+(i+1)+": ");
              marks[i]=sc.nextInt(); // marks[i] --> stores the marks given by the user 
              if(0<=marks[i]&& marks[i]<=100){
                  System.out.println("Marks in Subject" +(i+1)+": "+ marks[i]);
                  total+=marks[i];// only add the valid marks after satisfying the conditions 
              }
              else{
                  System.out.println("Enter valid Marks! Marks should be between 0 & 100\n ReEnter your marks! ");
                  i--;//for reEntering the marks 
              }
             
        }
        
        System.out.println("The total of your marks is :" + total);
        avg = total/numS;
        System.out.println("Your percentage is :"+ avg +"%");
       
        char grade;
        if(avg <30 ){ 
            grade = 'F'; 
        }
        else if(avg<=40){
            grade = 'E';
        }
        else if(avg<=50){
            grade = 'D';
        }
        else if(avg<=60){
            grade ='C';
        }
        else if(avg<=80){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is :"+ grade);
        
    }
   
    
}
