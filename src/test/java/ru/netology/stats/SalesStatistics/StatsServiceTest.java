package ru.netology.stats.SalesStatistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void averageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.averageSale(sales);
        long expected = 15;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void maximumAmount() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maximumAmount(sales);
        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void minimumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minimumSales(sales);
        long expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void numberOfMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.numberOfMonthsBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberOfMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.numberOfMonthsAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}