/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wheel.calculator;

/**
 *
 * @author chriskopec
 */
public class FitmentCalculator {
    
    public double fenderOffsetCalculator(double oldWidth, double newWidth, double currentOffset, double newOffset)
    {
        double result = 0;
        double oldWidthMM = oldWidth * 25.4;
        double newWidthMM = newWidth * 25.4;
        
        double diff = (newWidthMM - oldWidthMM) / 2;
        
        double offsetDiff = currentOffset - newOffset;
        
        result = diff + offsetDiff;
        
        return result;
    }
    
    public void printResult(double result)
    {
        if (result > 0)
        {
        System.out.println("You wheel will be " + result + "mm closer to the fender.");
        }
        if (result < 0)
        {
            result = -result;
            System.out.println("You wheel will be " + result + "mm closer to the strut.");
        }
    }
}
