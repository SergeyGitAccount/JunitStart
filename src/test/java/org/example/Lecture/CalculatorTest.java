package org.example.Lecture;

import org.example.Lecture.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void checkAdd(){
        Calculator calculator = new Calculator();
        int trueTest = calculator.add(5,5);
        Assert.assertEquals(10,trueTest);
    }
}
