package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends SolutionImpl {
    public Server() {}

    public static void main(String[] args) {
        try {
            SolutionImpl obj = new SolutionImpl();
            Solution stub = (Solution) UnicastRemoteObject.exportObject(obj, 0);
            int host = 2098;
            LocateRegistry.createRegistry(host);
            Registry registry = LocateRegistry.getRegistry(host);
            System.setProperty("java.rmi.server.hostname", "192.168.40.1");
            registry.bind("Solution", stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
            e.printStackTrace();
        }
    }
}
