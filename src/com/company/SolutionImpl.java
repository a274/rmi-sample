package com.company;

import java.rmi.RemoteException;

public class SolutionImpl implements Solution {
    private Equation equation;

    @Override
    public ResultEquation solveEquation(String[] arr) throws RemoteException {
        if (arr.length != 3) return null;
        try {
            equation = new Equation(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[2]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(equation.getResultEquation());
        return equation.getResultEquation();
    }
}
