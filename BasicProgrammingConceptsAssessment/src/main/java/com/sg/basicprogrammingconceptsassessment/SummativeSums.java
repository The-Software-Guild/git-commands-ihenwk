/**
 *
 * @author Ihesinachi Nwankwo
 */
package com.sg.basicprogrammingconceptsassessment;


public class SummativeSums {
    
    public static void main(String[] args){
    
    int [][] numbers = {
            { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
            { 999, -60, -77, 14, 160, 301 },
            { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,140, 150, 160, 170, 180, 190, 200, -99 }
        };
    
    int sum = 0;
    
    int [] newArr = new int[numbers.length];
    
    for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                sum += numbers[i][j];
                newArr[i] = sum;
    }
  
}
                int num1 = newArr[0];
                int num2 = newArr[1];
                int num3 = newArr[2];
                
                
                System.out.println("#1 Array Sum: " + num1);
                System.out.println("#2 Array Sum: " + num2 );
                System.out.println("#3 Array Sum: " + num3 );
    
}
    
}
