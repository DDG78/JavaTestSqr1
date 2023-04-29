package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int minRange, int maxRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= minRange) {
                if (iSquare <= maxRange) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
