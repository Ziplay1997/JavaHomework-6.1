package ru.netology.sqr;

public class SqrtService {
    public int calculate(int rangeInitial, int rangeEnd) {
        int sumSqrtNumbers = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeInitial & i * i <= rangeEnd) {
                sumSqrtNumbers = sumSqrtNumbers + 1;
            }
        }
        return sumSqrtNumbers;
    }
}
