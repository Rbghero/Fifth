package ru.netology.sqr;

public class SQRService {
    int bottomLine = 10;
    int topLine = 99;

    public int calcSqr(int x, int y) {
        int range = 0;
        int b = 0;
        for (int i = bottomLine; i <= topLine; i++) {
            b = i * i;
            if (b >= x && b <= y) {
                range = range + 1;;
            }
        }
        return range;
    }
}