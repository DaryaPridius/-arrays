package ru.netology.stats;

public class StatsService {
    public long getSalesAmount(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount += s;
        }
        return amount;
    }

    public long averageAmount(long[] sales) {
        long average = 0;
        for (long s : sales) {
            average = s + average;
        }
        return (average / sales.length);
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getLowSales(long[] sales) {
        int lowSales = 0;
        long midAmount = averageAmount(sales);
        for (long s : sales) {
            if (s < midAmount) {
                lowSales = lowSales + 1;
            }
        }
        return lowSales;
    }

    public int getHighSales(long[] sales) {
        int highSales = 0;
        long midAmount = averageAmount(sales);
        for (long s : sales) {
            if (s > midAmount) {
                highSales = highSales + 1;
            }
        }
        return highSales;
    }
}
