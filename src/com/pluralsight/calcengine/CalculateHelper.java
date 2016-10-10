package com.pluralsight.calcengine;

/**
 * Created by Fauzan on 10/9/2016.
 */
public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand mCommand;
    double mLeftValue;
    double mRightValue;
    double mResult;

    public void process(String statement){
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; //add
        mLeftValue = Double.parseDouble(parts[1]); //1.0
        mRightValue = Double.parseDouble(parts[2]); //2.0

        setCommandFromString(commandString);

        CalculateBase calculator = null;
        switch (mCommand){
            case Add:
                calculator = new Adder(mLeftValue, mRightValue);
                break;
            case Subtract:
                calculator = new Subratcter(mLeftValue, mRightValue);
                break;
            case Divide:
                calculator = new Divider(mLeftValue, mRightValue);
                break;
            case Multiply:
                calculator = new Multiplier(mLeftValue, mRightValue);
        }

        calculator.calculate();
        mResult = calculator.getResult();
    }

    private void setCommandFromString(String commandString){
        // add -> MathCommand.Add

        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            mCommand = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            mCommand = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            mCommand = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            mCommand = MathCommand.Divide;
    }

    @Override
    public String toString(){
        // 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (mCommand){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(mLeftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(mRightValue);
        sb.append(" = ");
        sb.append(mResult);

        return sb.toString();
    }
}
