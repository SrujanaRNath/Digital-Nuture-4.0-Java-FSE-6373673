// Forecast.java
public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }

        return futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization (optional)
    public static double futureValueMemo(double[] memo, double initialAmount, double growthRate, int years) {
        if (years == 0) return initialAmount;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(memo, initialAmount, growthRate, years - 1) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; // starting amount
        double growthRate = 0.10;       // 10% annual growth
        int years = 5;

        double result = futureValue(initialAmount, growthRate, years);
        System.out.println("Future Value after " + years + " years (recursive): $" + result);

        // Optional: Use memoization to optimize
        double[] memo = new double[years + 1];
        double resultMemo = futureValueMemo(memo, initialAmount, growthRate, years);
        System.out.println("Future Value after " + years + " years (memoized): $" + resultMemo);
    }
}
