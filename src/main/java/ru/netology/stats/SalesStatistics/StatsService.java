package ru.netology.stats.SalesStatistics;

public class StatsService {
    public long sum(long[] sales) {  //сумму всех продаж
        long salesAmount = 0;
        for (long sale : sales) {  // [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            salesAmount += sale;
        }
        return salesAmount;
    }

    public long averageSale(long[] sales) {  //средня сумма продаж в месяц
//        if (sales.length == 0) {
//            return  0;
//        }
        return sum(sales) / sales.length;
    }

    public int maximumAmount(long[] sales) {  //номер месяца продажи на максимальную сумму
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minimumSales(long[] sales) {  //номер месяца, в котором был минимум продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(long[] sales) {  //количество месяцев, в которых продажи были ниже среднего
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfMonthsAboveAverage(long[] sales) {  //количество месяцев, в которых продажи были выше среднего
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
