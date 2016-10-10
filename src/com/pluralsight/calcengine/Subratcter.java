package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/8/2016.
 */
public class Subratcter extends CalculateBase {
    public Subratcter(){}
    public Subratcter(double leftVal, double rightVal){

        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
