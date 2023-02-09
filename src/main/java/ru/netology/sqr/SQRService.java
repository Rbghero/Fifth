package ru.netology.sqr;

public class SQRService {
    int bottomLine = 10;
    int topLine = 99;

    public int calcSqr(int StartLimit, int LastLimit) {
        int range = 0;
        int ValuableCount = 0;
        for (int i = bottomLine; i <= topLine; i++) {
            ValuableCount = i * i;
            if (ValuableCount >= StartLimit && ValuableCount <= LastLimit) {
                range = range + 1;
            }
        }
        return range;

    }
}