package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;

class StaticServiceTest {
    @org.junit.jupiter.api.Test
//    @ParameterizedTest

    void minSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void sumSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void aboveAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageSales (sales);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSales(sales);
        assertEquals(expected, actual);
    }
}



