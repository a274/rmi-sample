package com.company;

import java.io.Serializable;

public class ResultEquation implements Serializable {
    private final String res;

    public ResultEquation(double res1, double res2) {
        this.res = String.format("%.2f %.2f", res1, res2);
    }

    public ResultEquation(double res) {
        this.res = String.format("%.2f", res);
    }

    public ResultEquation() {
        this.res = "no roots";
    }


    @Override
    public String toString() {
        return res;
    }
}
