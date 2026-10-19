package no.hvl.dat100.javel.oppgave2;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // 1
        System.out.println("#1:");
        MonthlyPower.print_PowerUsage(power_usage_month);

        // 2
        System.out.println("\n\n#2:");
        MonthlyPower.print_PowerPrices(power_prices_month);

        // 3
        System.out.println("\n\n#3:");
        System.out.println("Monthly kHw: " + MonthlyPower.computePowerUsage(power_usage_month) + "kWh");

        // 4
        System.out.println("\n\n#4:");
        System.out.println("Passed 600 kWh: " + MonthlyPower.exceedThreshold(power_usage_month, 600));
        System.out.println("Passed 900 kWh: " + MonthlyPower.exceedThreshold(power_usage_month, 900));
        System.out.println("Passed 1200 kWh: " + MonthlyPower.exceedThreshold(power_usage_month, 1200));

        // 5
        System.out.println("\n5:");
        System.out.println("Total cost of this months power: " + MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month) + " NOK");

        // 6
        System.out.println("\n6:");
        System.out.println("Power support for this month: " + MonthlyPower.computePowerSupport(power_usage_month, power_prices_month) + " NOK");

        // 7
        System.out.println("\n7");
        System.out.println("Price of this months power with Norgespris: " + MonthlyPower.computeNorgesPrice(power_usage_month) + " NOK");
    }
}