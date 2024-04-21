package Ass1.client_server.src;


import java.rmi.*;

public class AddServer {
public static void main(String args[]) {
try { 
//create remote object
ServerIntf addServerImpl = new AddServerImpl(); 
//bind the remote object
Naming.rebind("AddServer", addServerImpl);
}
catch (Exception e) {
System.out.println("Exception: "+ e);
}}}