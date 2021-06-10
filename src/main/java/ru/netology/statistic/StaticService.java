package ru.netology.statistic;

public class StaticService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long calculateSumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumForAverage = calculateSumSales(sales);
        return sumForAverage / sales.length;
    }

    public int aboveAverageSales(long[] sales) {
        long averageMonthlySales = averageSales(sales);
        int monthAboveAverage = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > averageMonthlySales) {
                monthAboveAverage++;
            }
            month = month + 1;
        }
        return monthAboveAverage;
    }


    public int belowAverageSales(long[] sales) {
        long averageMonthlySales = averageSales(sales);
        int monthBelowAverage = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < averageMonthlySales) {
                monthBelowAverage++;
            }
            month = month + 1;
        }
            return monthBelowAverage;
        }
    }
