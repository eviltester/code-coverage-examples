package com.eviltester.codecoverage.statement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatementCoverageTest {

    @Test
    public void zeroWhenValueInMiddle(){
        int result = new StatementCoverageTarget(3,10).
                        whereInRange(4);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void minusWhenValueIsLower(){
        int result = new StatementCoverageTarget(3,10).
                        whereInRange(2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void positiveWhenValueIsHigher(){
        int result = new StatementCoverageTarget(3,10).
                        whereInRange(11);
        Assertions.assertEquals(1, result);
    }

    // Above is enough for statement coverage but we did not cover all conditions
    //  sometimes conditions is measured by tools as Branch coverage e.g. Jacoco, IntelliJ

    // Exercise: experiment with IntelliJ Code coverate configuration
    // IntelliJ code coverage would report 100% code coverage by default
    //     edit the run configuration Code Coverage configuration to use tracing
    //     to see the branch coverage metrics
    //     https://www.jetbrains.com/help/idea/running-test-with-coverage.html
    // Run with different engines from IDE: IntelliJ, Jacoco

    // Exercise: disable some of the tests and see the impact on the code coverage

    // Exercise: remove the assertions and see the impact on code coverage

    // Exercise, remove the assertion

}
