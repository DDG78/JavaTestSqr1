package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcFoundSomeSquares() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcFoundOneSquare() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcNotFoundSquare() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
