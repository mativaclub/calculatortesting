package com.calculatortesting.calculatortesting;

import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenPlus1and2() {
        assertEquals(THREE, out.plus(ONE, TWO));
    }


    @Test
    public void shouldReturn2WhenPlus0and2() {
        assertEquals(TWO, out.plus(ZERO, TWO));
    }


    @Test
    public void shouldReturn0WhenMinus2and2() {
        assertEquals(ZERO, out.minus(TWO, TWO));
    }


    @Test
    public void shouldReturn1WhenMinus2and1() {
        assertEquals(ONE, out.minus(TWO, ONE));
    }


    @Test
    public void shouldReturn1WhenMultiply1and1() {
        assertEquals(ONE, out.multiply(ONE, ONE));
    }


    @Test
    public void shouldReturn2WhenMultiply2and1() {
        assertEquals(TWO, out.multiply(TWO, ONE));
    }


    @Test
    public void shouldReturn1WhenDivide2and2() {
        assertEquals(ONE, out.divide(TWO, TWO));
    }


    @Test
    public void shouldReturn2WhenDivide2and1() {
        assertEquals(TWO, out.divide(TWO, ONE));
    }

    @Test
    public void shouldThrowDivideByZeroExceptionWhenDivideBy0() {
        assertThrows(DivideByZeroException.class, () -> out.divide(TWO, ZERO));
    }




}
