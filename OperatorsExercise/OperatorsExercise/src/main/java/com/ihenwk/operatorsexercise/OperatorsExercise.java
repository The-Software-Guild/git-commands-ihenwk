/**
 *
 * @author Ihesinahi Nwankwo
 */

package com.ihenwk.operatorsexercise;


public class OperatorsExercise {

    public static void main(String[] args) {
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        result = 0;
        
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
        //Addition
        
        result = 42 + 53;
        
        System.out.println(result);
        
        result = operand1 + operand2;
        System.out.println(result);
        
        result = 1 + operand1;
        System.out.println(result);
        
        result = 1 + operand1 + operand2 + operand3;
        System.out.println(result);
        
        result = 2;
        System.out.println(result);
        
         result += 4;
        System.out.println(result);
        
        result += operand1;
        System.out.println(result);
        
        //Subtraction
        
        result = 9 - 5;
        System.out.println(result);
        
        result = operand1 - operand2;
        System.out.println(result);
        
        result = 15 - operand1;
        System.out.println(result);
        
        result = 19 - operand1 - operand2 - operand3;
        System.out.println(result);
        
        result = 2;
        System.out.println(result);
        
        result -= 4; 
        System.out.println(result);
        
        result -= operand1;
        System.out.println(result);
        
        //Multiplication
        
         result = 2 * 3;
         System.out.println(result);
         
         result = operand1 * operand2; 
         System.out.println(result);
         
         result = 2 * operand1;
         System.out.println(result);
         
         result = 2 * operand1 * operand2 * operand3;
         System.out.println(result);
         
         result = 2;
         System.out.println(result);
         
         result *= 4;
         System.out.println(result);
         
         result *= operand1;
         System.out.println(result);
         
        //Division + Modulus
        
        result = 6 / 3; 
        System.out.println(result);
        
        result = operand1 / operand2;
        System.out.println(result);
        
        /**
         When dividing integers, integer division is used -
         * we only get the whole number part of the quotient.  In this case, 
         * 7 goes into 5 0 times with a remainder of 5.
         * We use the modulus operator (%) to get the remainder:
         */
        
        result = operand1 % operand2;
        System.out.println(result);
        
        result = 20 / operand1;
        System.out.println(result);
        
        result = 245 / operand1 / operand2 / operand3;
        System.out.println(result);
        
        result = 40; 
        System.out.println(result);
        
        result /= 4; 
        System.out.println(result);
        
        result /= operand1;
        System.out.println(result);
        
    }
}
