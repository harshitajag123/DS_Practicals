import java.rmi.*;
import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException{
        super();

    }
    @Override
    public double addition(double num1, double num2) throws  RemoteException{
        return num1+num2;

    }

    public double substraction(double num1, double num2) throws  RemoteException{
        return num1-num2;

    }
    public double Division(double num1, double num2) throws  RemoteException{
        // if(num2!=0){
        //     return  num1/num2;
        // }
        // else{
        //     System.out.println("Cannot divide a number by zero");
        // }
        return num1/num2;

    }



    
}
