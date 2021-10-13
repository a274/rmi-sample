package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Solution extends Remote {
    Equation solveEquation(String[] arr) throws RemoteException;
}
