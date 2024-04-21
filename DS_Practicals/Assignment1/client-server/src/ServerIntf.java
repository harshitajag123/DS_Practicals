
import java.rmi.*;

interface ServerIntf extends Remote{
    public double addition(double num1, double num2) throws  RemoteException;
    public double substraction(double num1, double num2) throws  RemoteException;
    public double Division(double num1, double num2) throws  RemoteException;
    
}

