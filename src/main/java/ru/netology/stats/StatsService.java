package ru.netology.stats;

public class StatsService {
    public int getSalesAmount(int[] sales) {
        int amount = 0;
        for (int s : sales) {
            amount += s;
        }
        return amount;
    }

    public int averageAmount(int[] sales) {
        int average = 0;
        for (int s : sales) {
            average = s + average;
        }
        return average / sales.length;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getLowSales(int[] sales) {
        int lowSales = 0;
        int midAmount = averageAmount(sales);
        for (int s : sales) {
            if (s < midAmount) {
                lowSales = lowSales + 1;
            }
        }
        return lowSales;
    }

    public int getHighSales(int[] sales) {
        int highSales = 0;
        int midAmount = averageAmount(sales);
        for (int s : sales) {
            if (s > midAmount) {
                highSales = highSales + 1;
            }
        }
        return highSales;
    }
}
