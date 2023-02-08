package ru.netology.sqr;

public class Main {

    public static void main (String[] args) {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);
        System.out.println (expected +  " ==?==" + actual);
    }
}
