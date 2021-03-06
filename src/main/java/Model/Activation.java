/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.Utils;
import Utils.ActivationFunction;

/**
 *
 * @author gzzengzihang
 */
public class Activation {
    private String name;
    
    public Activation(String name){
        this.name = name;
    }
    
    public double[][] activation(double[][] x){
        switch(this.name){
            case "sigmoid":
                return sigmoid(x);
            case "tanh":
                return tanh(x);
            default:
                return sigmoid(x);
        }
    }
    
    public double[][] activationDerivative(double[][] x){
        switch(this.name){
            case "sigmoid":
                return sigmoidDerivative(x);
            default:
                return sigmoidDerivative(x);
        }
    }
    
    public int activationLabel(double[][] x){
        switch(this.name){
            case "sigmoid":
                return sigmoidLabel(x);
            default:
                return sigmoidLabel(x);
        }
    }
    
    private double[][] sigmoid(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                result[i][j] = ActivationFunction.sigmoid(x[i][j]);
            }
        }
        return result;
    }
    
    private double[][] sigmoidDerivative(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                result[i][j] = ActivationFunction.sigmoidDerivative(x[i][j]);
            }
        }
        return result;
    }
    
    private int sigmoidLabel(double[][] x){
        return ActivationFunction.sigmoidLabel(x[0][0]);
    }
    
    private double[][] tanh(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                result[i][j] = ActivationFunction.tanh(x[i][j]);
            }
        }
        return result;
    }
    
    private double[][] tanhDerivative(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                result[i][j] = ActivationFunction.tanhDerivative(x[i][j]);
            }
        }
        return result;
    }
    
    private int tanhLabel(double[][] x){
        return ActivationFunction.tanhLabel(x[0][0]);
    }
}
