package test;

import forecast.FinancialForecast;

public class ForecastTest {
    public static void main(String[] args) {
        double pv = 10000;
        double rate = 0.07;
        int years = 5;

        System.out.printf("Recursive: Future value after %d years = %.2f\n", years,
            FinancialForecast.forecast(pv, rate, years));

        System.out.printf("Iterative: Future value after %d years = %.2f\n", years,
            FinancialForecast.forecastIterative(pv, rate, years));
    }
}
