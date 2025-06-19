package forecast;

public class FinancialForecast {
    public static double forecast(double pv, double rate, int years) {
        if (years == 0) return pv;
        return forecast(pv, rate, years - 1) * (1 + rate);
    }

    public static double forecastIterative(double pv, double rate, int years) {
        for (int i = 0; i < years; i++) {
            pv *= (1 + rate);
        }
        return pv;
    }
}
