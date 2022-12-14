package tests;

import math.TaylorSeries;

public class TaylorSeriesTest {

    public static final double EPS = 0.0001;

    public static final int N = 50;

    public static void testExp(double x){
        String result = "";
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.exp(x, N) - Math.exp(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Exponential. With x = " + x +
                    "\nMy method result: " + TaylorSeries.exp(x, N));
            System.out.println("Math method result: " + Math.exp(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testExpEps(double x){
        String result = "";
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.expEps(x, EPS) - Math.exp(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Exponential. With x = " + x +
                    "\nMy method result: " + TaylorSeries.expEps(x, EPS));
            System.out.println("Math method result: " + Math.exp(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testSin(double x){
        String result;
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.sin(x, N) - Math.sin(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Sine. With x = " + x +
                    "\nMy method result: " + TaylorSeries.sin(x, N));
            System.out.println("Math method result: " + Math.sin(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testSinEps(double x){
        String result;
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.sinEps(x, EPS) - Math.sin(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Sine. With x = " + x +
                    "\nMy method result: " + TaylorSeries.sinEps(x, EPS));
            System.out.println("Math method result: " + Math.sin(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testCos(double x){
        String result;
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.cos(x, N) - Math.cos(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Cosine. With x = " + x +
                    "\nMy method result: " + TaylorSeries.cos(x, N));
            System.out.println("Math method result: " + Math.cos(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testCosEps(double x){
        String result;
        int i = 1;
        while (x < 30){
            if (Math.abs(TaylorSeries.cosEps(x, EPS) - Math.cos(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Cosine. With x = " + x +
                    "\nMy method result: " + TaylorSeries.cosEps(x, EPS));
            System.out.println("Math method result: " + Math.cos(x) +
                    "\nTest result: " + result);
            x += 1.5;
            i++;
        }
    }

    public static void testAtan(double x){
        String result;
        int i = 1;
        while (x < 1){
            if (Math.abs(TaylorSeries.atan(x, N) - Math.atan(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Arc tangent. With x = " + x +
                    "\nMy method result: " + TaylorSeries.atan(x, N));
            System.out.println("Math method result: " + Math.atan(x) +
                    "\nTest result: " + result);
            x += 0.015;
            i++;
        }
    }

    public static void testAtanEps(double x){
        String result;
        int i = 1;
        while (x < 1){
            if (Math.abs(TaylorSeries.atanEps(x, EPS) - Math.atan(x)) <= EPS){
                result = "valid";
            }
            else result = "invalid";
            System.out.println("----Test" + i + ". Arc tangent. With x = " + x +
                    "\nMy method result: " + TaylorSeries.atanEps(x, EPS));
            System.out.println("Math method result: " + Math.atan(x) +
                    "\nTest result: " + result);
            x += 0.015;
            i++;
        }
    }
}
