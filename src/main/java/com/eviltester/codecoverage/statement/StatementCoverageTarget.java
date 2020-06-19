package com.eviltester.codecoverage.statement;

public class StatementCoverageTarget {

    private final int lower;
    private final int upper;

    public StatementCoverageTarget(int lower, int upper){
        this.lower = lower;
        this.upper = upper;
    }

    public int whereInRange(int value){
        if((value == lower) || ( value>lower && value <upper) || (value==upper) ){
            return 0;
        }
        if(value < lower){
            return -1;
        }
        //if(value > upper){
            return 1;
        //}

        // Discuss: changing the complicated if statement (value>=lower && value<=upper)
        //          can reduce complexity and allow more branch coverage
        //          with fewer tests would that be better?
        // Discuss: what would I have to do if I re-instated the last if statement?
    }
}
