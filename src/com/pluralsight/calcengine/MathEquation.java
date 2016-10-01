package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/2/2016.
 */
public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = leftVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error Invalid opCode");
                result = 0.0d;
                break;
        }
    }

}
