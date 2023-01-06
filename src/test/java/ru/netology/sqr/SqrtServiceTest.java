package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void rangeIncomingBorders() {            // №1 Квадраты чисел попадают на границы
        SqrtService service = new SqrtService();

        int expected = 11;
        int actual = service.calculate(100, 400);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeNotIncomingBorder() {          // №2 Квадраты чисел не попадают на границы
        SqrtService service = new SqrtService();

        int expected = 2;
        int actual = service.calculate(250, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allNumberIncomingRange() {          // №3 В границы входят все квадраты чисел от 10 до 99
        SqrtService service = new SqrtService();

        int expected = 90;
        int actual = service.calculate(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noOneNumberNotIncomingRange() {         // №4 Ни одно число не входит в границы
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calculate(101, 120);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeInitialEqualsRangeEnd() {          // №5 Границы начала и конца равны
        SqrtService service = new SqrtService();

        int expected = 1;
        int actual = service.calculate(100, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void onlyOneNumberIncomingRange() {          // №6 Только одно число входит в границы
        SqrtService service = new SqrtService();

        int expected = 1;
        int actual = service.calculate(122, 144);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeLessBorders() {            // №7 Диапазон охватывающий квадраты чисел меньше 10
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calculate(1, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeMoreBorders() {            // №8 Диапазон охватывающий квадраты чисел больше 99
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calculate(9802, 12121);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void initialRangeLessBorders() {         // №9 Начальный диапазон включает квадраты чисел меньше 10
        SqrtService service = new SqrtService();

        int expected = 6;
        int actual = service.calculate(1, 250);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void endRangeMoreBorders() {         // №10 Конечный диапазон включает квадраты чисел больше 90
        SqrtService service = new SqrtService();

        int expected = 90;
        int actual = service.calculate(100, 15011);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void initialAndEndRangeNotIncomingBorders() {            // №11 Начальный и конечный диапазон включает квадраты чисел меньше 10 и больше 90
        SqrtService service = new SqrtService();

        int expected = 90;
        int actual = service.calculate(1, 15011);

        Assertions.assertEquals(expected, actual);
    }

}
