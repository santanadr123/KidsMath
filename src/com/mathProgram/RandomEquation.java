package com.mathProgram;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santa
 */
public class RandomEquation
{
    private int digit1;
    private int digit2;
    private int equationResult;
    private String equationCreated;

    public void randomEquation(String operation) {
        setDigit1((int) (Math.random() * 20 + 1));
        setDigit2((int) (Math.random() * 20 + 1));
        setEquationCreated(getDigit1() + operation + getDigit2() + " = ");
    }

    public String getEquationCreated() {
        return equationCreated;
    }

    public void setEquationCreated(String equationCreated) {
        this.equationCreated = equationCreated;
    }

    public int getDigit1() {
        return digit1;
    }

    public void setDigit1(int digit1) {
        this.digit1 = digit1;
    }

    public int getDigit2() {
        return digit2;
    }

    public void setDigit2(int digit2) {
        this.digit2 = digit2;
    }

    public int getEquationResult() {
        return equationResult;
    }

    public void setEquationResult(int result) {
        this.equationResult = result;
    }
}
