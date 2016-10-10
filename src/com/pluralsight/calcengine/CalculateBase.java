package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/8/2016.
 */
public abstract class CalculateBase {
    private double mLeftVal;
    private double mRightVal;
    private double mResult;

    //getter dan setter
    public double getLeftVal() {return mLeftVal;}
    public void setLeftVal(double leftVal){this.mLeftVal = leftVal;}

    public double getRightVal() {return mRightVal;}
    public void setRightVal(double rightVal){this.mRightVal = rightVal;}

    public double getResult(){return mResult;}
    public void setResult(double result){ this.mResult = result;}

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal){
        this.mLeftVal = leftVal;
        this.mRightVal = rightVal;
    }

    public abstract void  calculate();
}
