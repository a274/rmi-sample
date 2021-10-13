package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Solution extends Remote {
    ResultEquation solveEquation(String[] arr) throws RemoteException;
}
