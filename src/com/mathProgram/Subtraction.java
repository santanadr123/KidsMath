package com.mathProgram;

public class Subtraction extends RandomEquation implements OperationCalculations {

    private final String OPERATOR = " - ";

    @Override
    public String getEquation() {
        randomEquation(OPERATOR);
        if(getDigit1() < getDigit2())
            getEquation();
        return getEquationCreated();
    }

    @Override
    public String getResult() {
        setEquationResult(getDigit1() - getDigit2());
        return Integer.toString(getEquationResult());
    }
}
