package com.mathProgram;

public class Addition extends RandomEquation implements OperationCalculations {

    private final String OPERATOR = " + ";

    @Override
    public String getEquation() {
        randomEquation(OPERATOR);
        return getEquationCreated();
    }

    @Override
    public String getResult() {
        setEquationResult(getDigit1() + getDigit2());
        return Integer.toString(getEquationResult());
    }
}
