package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/2/2016.
 */
public class MathEquation {
    private double mLeftVal;
    private double mRightVal;
    private char mOpCode;
    private double mResult;

    //getter dan setter
    public double getLeftVal() {return mLeftVal;}
    public void setLeftVal(double leftVal){this.mLeftVal = leftVal;}

    public double getRightVal() {return mRightVal;}
    public void setRightVal(double rightVal){this.mRightVal = rightVal;}

    public double getOpCode() {return mOpCode;}
    public void setOpCode(char opCode){this.mOpCode = opCode;}

    public double getResult(){return mResult;}

    //constructor
    public MathEquation(){}
    public MathEquation(char opCode){
        this.mOpCode = opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.mLeftVal = leftVal;
        this.mRightVal = rightVal;
    }

    //method
    public void execute(double leftVal, double rightVal){
        this.mLeftVal = leftVal;
        this.mRightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal){
        this.mLeftVal = leftVal;
        this.mRightVal = rightVal;

        execute();

        mResult = (int) mResult;
    }


    public void execute(){
        switch (mOpCode) {
            case 'a':
                mResult = mLeftVal + mRightVal;
                break;
            case 's':
                mResult = mLeftVal - mRightVal;
                break;
            case 'd':
                mResult = mLeftVal != 0.0d ? mLeftVal / mRightVal : 0.0d;
                break;
            case 'm':
                mResult = mLeftVal * mRightVal;
                break;
            default:
                System.out.println("Error Invalid opCode");
                mResult = 0.0d;
                break;
        }
    }

}
