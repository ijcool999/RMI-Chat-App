package com.remote.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String []args){
        try {
            LocateRegistry.createRegistry(5050);
            Naming.rebind("rmi://10.160.66.188:5050/remote",new ChatServer());
            System.out.println("Server Started ...");
        } catch (MalformedURLException | RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}