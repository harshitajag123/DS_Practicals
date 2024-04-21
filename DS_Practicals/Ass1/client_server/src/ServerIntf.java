package Ass1.client_server.src;
import java.rmi.*;

interface ServerIntf extends Remote{
    public double addition(double num1, double num2) throws RemoteException;
    // public double Substraction(double num1, double num2) throws RemoteException;
    // public double multiplication(double num1, double num2) throws RemoteException;
    // public double Division(double num1, double num2) throws RemoteException;
}