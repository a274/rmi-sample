package com.company;

public class Equation {
    private final double a;
    private final double b;
    private final double c;
    private ResultEquation resultEquation;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.solve();
    }

    public ResultEquation getResultEquation() {
        return resultEquation;
    }

    private void solve() {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            resultEquation = new ResultEquation(x1, x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            resultEquation = new ResultEquation(x);

        } else {
            resultEquation = new ResultEquation();
        }
    }
}
