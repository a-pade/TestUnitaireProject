package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy3_ShouldReturnFizz(){
        //Arrange
        int nombre = 9;
        String outputExpected = "Fizz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_NumberDivisibleBy5_ShouldReturnBuzz(){
        //Arrange
        int nombre = 35;
        String outputExpected = "Buzz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);
    }

    public void testDoFizzBuzz_NumberDivisibleBy3And5_ShouldReturnBuzz(){
        //Arrange
        int nombre = 30;
        String outputExpected = "FizzBuzz";
        FizzBuzz fb = new FizzBuzz();

        //Act
        String result = fb.doFizzBuzz(nombre);

        //Assert
        Assert.assertEquals(outputExpected, result);
    }
}
