package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    // Addition Unit Testing Coverage
    /**
     * test sum of 20 + 30 + 30 = 60
     *  and 100 + 20 + 30  = 150
     */
    @Test
    public void testSumOfTenPlusTwentyPlusThirtyBecomesSixtyAndHundredPlusTwentyPlusThirty(){
        double result = calculator.sum(new double[]{10,20,30});
        Assert.assertEquals(60,result,0);

        result = calculator.sum(new double[]{100,20,30});
        Assert.assertEquals(150,result,0);
    }
    /**
     * To test sum of small numbers to be positive
     */
    @Test
    public void testSumOfTwoPlusThreePlusSizEqualsTwelve(){
        double res = calculator.sum(new double[]{2,4,6});
        Assert.assertEquals(12,res,0);
    }
    /**
     * To test sum of negative and higher positive value result in positive val
     */
    @Test
    public void testSumOfNegativeFivePlusNegativeSixPlusTwelveToBeOne(){
        double res = calculator.sum(new double[]{-5,-6,12});
        Assert.assertEquals(1,res,0);
    }

    // Subtraction Unit Testing Coverage
    /**
     * the first digit has to be positive and higher to subtract from others
     */
    @Test
    public void subtract(){
        double result = calculator.subtract(new double[]{10,20,5,1,6});
        Assert.assertEquals(-22,result,0);
    }

    // Multiplication Unit Testing Coverage
    /**
     */
    @Test
    public void multiplication(){
        double result = calculator.Multiplication(new double[]{1,2,3,4,5});
        Assert.assertEquals(120, result,0);
    }

    // Division Unit Testing Coverage
    /**
     * Test division of two positive numbers result in positive value.
     *              10 / 2 = 5
     */
    @Test
    public void divide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(5, result, 0);
    }
    /**
     * to test division by zero not possible
     */
    @Test
    public void TestDivisionByZero(){
        Assert.assertEquals(Double.MIN_VALUE,calculator.divide(5,0),0);
    }

    // SquareRoot Unit Testing Coverage
    /**
     * To test square root of a 25 to be 5
     */
    @Test
    public void testSquareRootOfTwentyFive(){
        double result = calculator.squareRoot(25);
        Assert.assertEquals(5,result,0);
    }

    /**
     * To test square root of a 37 to be 6.082762530298219
     */
    @Test
    public void testSquareRootOfThirtySeven(){
        double result = calculator.squareRoot(37);
        Assert.assertEquals(6.082762530298219,result,0);
    }
    /**
     * test to find that negative values cannot be found which are imaginary numbers
     */
    @Test
    public void squareRootOfNegativeTwentyFive(){
        Assert.assertEquals(Double.MIN_VALUE,calculator.squareRoot(-25),0);
    }

    // Modulo Unit Testing Coverage
    /**
     * To test modulo of two positive no 
     */
    @Test
    public void moduloOfTwoNum(){
        double result = calculator.moduloOfTwoNum(5,2);
        Assert.assertEquals(1,result,0);
    }

    /**
     * To test Modulo of two negative numbers to be positive by converting them to positive number
     */
    @Test
    public void moduloOfNegativeTwentyAndNegativeFive(){
        Assert.assertEquals(0,calculator.moduloOfTwoNum(-20,-5),0);
    }

    /**
     * test the Modulo of positive numbers to be positive
     */
    @Test
    public void moduloOfNegativeSixtySixAndFive(){
        Assert.assertEquals(1,calculator.moduloOfTwoNum(66,5),0);
     }

    /**
     * Modulo of number by zero is not possible
     */
    @Test
    public void moduloOfTwentyAndZero(){
            Assert.assertEquals(Double.MIN_VALUE, calculator.moduloOfTwoNum(20,0),0);
        Assert.assertEquals(Double.MIN_VALUE, calculator.moduloOfTwoNum(-20,0),0);
    }

    // Averages Unit Testing Coverage
    /**
     * To test average of positive values
     * ( 1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3
     */
    @Test
    public void testAverageOfFirstFiveNaturalNumbers(){
        double result = calculator.Average(new double[]{1,2,3,4,5});
        Assert.assertEquals(3,result,0);
    }
    /**
     * To test average of positive values
     * ( - 1 - 2 - 3 - 4 - 5) / 5 = -15 / 5 = -3
     */
    @Test
    public void testAverageOfFirstFiveNegativeIntegerNumbers(){
        double result = calculator.Average(new double[]{-1, -2, -3, -4, -5});
        Assert.assertEquals(-3,result,0);
    }

    /**
     * To test weather the average function throws an error when no number is passed.
     */
    @Test
    public void AverageEmptyArray(){
        Assert.assertThrows(IllegalArgumentException.class,
                ()->{
            calculator.Average(new double[]{});
        });
    }

    // Factorial Unit Testing Coverage
    /**
     * Test Factorial of Natural Number 5 to return 120
     */
    @Test
    public void testFactorialOfPositiveFive(){
        double result = calculator.factorial(5);
        Assert.assertEquals(120,result,0);
    }

    /**
     * Test the factorial of negative number not possible
     */
    @Test
    public void testFactorialOfNegativeTwentySix(){
        Assert.assertEquals(0,calculator.factorial(-26));
    }
}