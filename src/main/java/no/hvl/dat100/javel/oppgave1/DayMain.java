package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // 1
        System.out.println("#1:");
        DailyPower.printPowerPrices(powerprices_day);

        // 2
        System.out.println("\n\n#2:");
        DailyPower.printPowerUsage(powerusage_day);

        // 3
        System.out.println("\n\n#3:");
        System.out.println("Total power used today: " + DailyPower.computePowerUsage(powerusage_day) + " kWh");

        // 4
        System.out.println("\n4:");
        System.out.println("Total cost of todays power: " + DailyPower.computeSpotPrice(powerusage_day, powerprices_day) + " NOK");

        // 5
        System.out.println("\n5:");
        System.out.println("Amount of support for the day: " + DailyPower.computePowerSupport(powerusage_day, powerprices_day) + " NOK");

        // 6
        System.out.println("\n6:");
        System.out.println("Price following Norgespris for the day: " + DailyPower.computeNorgesPrice(powerusage_day) + " NOK");

        // 7
        System.out.println("\n7:");
        System.out.println("The highest per hour kWh today: " + DailyPower.findPeakUsage(powerusage_day) + " kWh");

        // 8
        System.out.println("\n8:");
        System.out.println("Average power usage today: " + DailyPower.findAvgPower(powerusage_day) + " kWh");

    }
}