/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author gzzengzihang
 */
public class ActivationFunction {
    
    public static double sigmoid(double x){
        return 1 / (1 + Math.exp(-x));
    }
    
    public static double sigmoidDerivative(double x){
        return 1 - (1 / (1 + Math.exp(-x)));
    }
    
    public static double tanh(double x){
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }
    
    public static double tanhDerivative(double x){
        return 1 - Math.pow(tanh(x), 2);
    }
}