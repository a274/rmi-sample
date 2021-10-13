package com.company;

public class ResultEquation{
    private double[] res;

    public ResultEquation(double res1, double res2) {
        this.res = new double[]{res1, res2};
    }

    public ResultEquation(double res) {
        this.res = new double[] {res};
    }

    public ResultEquation() {
    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (double i : res) {
            out.append(i).append(" ");
        }
        return out.toString();
    }
}
