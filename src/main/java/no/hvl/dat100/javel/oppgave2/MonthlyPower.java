package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        int days = usage.length;

        for (int day = 0; day < days; day++) {
            System.out.print("\nDay " + day + ": ");
            for (int i = 0; i < usage[day].length; i++) {
                System.out.printf("%.2f NOK ", usage[day][i]);
            }
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        int days = prices.length;

        for (int day = 0; day < days; day++) {
            System.out.print("\nDay " + day + ": ");
            for (int i = 0; i < prices[day].length; i++) {
                System.out.printf("%.2f NOK ", prices[day][i]);
            }
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        int days = usage.length;

        for (int day = 0; day < days; day++) {
            sum += DailyPower.computePowerUsage(usage[day]);
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
        double sum = 0;
        int days = powerusage.length;

        for (int day = 0; day < days; day++) {
            sum += DailyPower.computePowerUsage(powerusage[day]);
            if (sum > threshold) return true;
        }

        return false;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        int days = usage.length;

        for (int day = 0; day < days; day++) {
            price += DailyPower.computeSpotPrice(usage[day], prices[day]);
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double support = 0;
        int days = usage.length;

        for (int day = 0; day < days; day++) {
            support += DailyPower.computePowerSupport(usage[day], prices[day]);
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;
        int days = usage.length;

        for (int day = 0; day < days; day++) {
            price += DailyPower.computeNorgesPrice(usage[day]);
        }

        return price;
    }
}
