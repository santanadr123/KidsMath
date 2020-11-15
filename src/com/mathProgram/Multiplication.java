package com.mathProgram;

public class Multiplication extends RandomEquation implements OperationCalculations {

    private final String OPERATOR = " x ";

    @Override
    public String getEquation() {
        randomEquation(OPERATOR);
        if((getDigit1() > 10) || (getDigit2() > 10))
            getEquation();
        return getEquationCreated();
    }

    @Override
    public String getResult() {
        setEquationResult(getDigit1() * getDigit2());
        return Integer.toString(getEquationResult());
    }
}
