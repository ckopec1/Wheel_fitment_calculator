/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wheel.calculator;

import java.util.Scanner;

/**
 *
 * @author chriskopec
 */
public class WheelCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Weel Fitment Calculator\n");
        System.out.println("Enter your current offset: ");
        double currentOffset = keyboard.nextDouble();
        System.out.println("Enter you current wheel width: ");
        double currentWidth = keyboard.nextDouble();
        System.out.println("Enter your new offset: ");
        double newOffset = keyboard.nextDouble();
        System.out.println("Enter your new wheel width: ");
        double newWidth = keyboard.nextDouble();
        
        FitmentCalculator object = new FitmentCalculator();
        
        
        double result = object.fenderOffsetCalculator(currentWidth, newWidth, currentOffset, newOffset);
        
        result = Math.round(result * 100.00) / 100.00;
        
        object.printResult(result);
        
        
        
    }
    
}
