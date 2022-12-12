package math;

public class TaylorSeries {

    public static double exp(double x, int n){
        double sum = 1;
        double factorial = 1;
        double numerator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= x;
            factorial *= i;
            sum += numerator / factorial;
        }
        return sum;
    }

    public static double expEps(double x, double eps){
        double sum = 1;
        double factorial = 1;
        double numerator = 1;
        double i = 1;
        double a = sum;
        while (a > eps || -a > eps){
            numerator *= x;
            factorial *= i;
            sum += numerator / factorial;
            i++;
            a = numerator / factorial;
        }
        return sum;
    }

    public static double sin(double x, int n){
        double sum = 0;
        double denominator = 1;
        double numerator = 1;
        double sign = 1;
        for (int i = 1; i <= 2 * n + 1; i++) {
            numerator *= x;
            denominator *= i;
            if (i % 2 != 0){
                sum += numerator / denominator * sign;
                sign = -sign;
            }
        }
        return sum;
    }

    public static double cos(double x, int n){
        double sum = 1;
        double numerator = 1;
        double denominator = 1;
        double sign = -1;
        for (int i = 1; i <= 2 * n; i++) {
            numerator *= x;
            denominator *= i;
            if (i % 2 == 0){
                sum += numerator / denominator * sign;
                sign = -sign;
            }
        }
        return sum;
    }

}
