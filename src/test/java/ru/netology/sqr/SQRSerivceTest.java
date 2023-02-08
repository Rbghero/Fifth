package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRSerivceTest {
    @Test
    public void testNumberOne () {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNumberTwo () {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqr(100,300);

        Assertions.assertEquals(expected, actual);

    }



}
