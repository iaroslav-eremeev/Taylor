package math;

public class TaylorSeries {

    public static double exp(double x, int n){
        double sum = 1;
        double factorial = 1;
        double numerator = 1;
        for (double i = 1; i <= n; i++) {
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
        while (a > eps){
            numerator *= x;
            factorial *= i;
            sum += numerator / factorial;
            i++;
            a = numerator / factorial;
        }
        return sum;
    }

}
