package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/8/2016.
 */
public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
