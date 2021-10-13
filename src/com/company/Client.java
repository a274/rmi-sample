package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.40.1", 2098);
            Solution stub = (Solution) registry.lookup("Solution");
            ResultEquation resultEquation = stub
                    .solveEquation(args)
                    .getResultEquation();
            System.out.println(resultEquation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
