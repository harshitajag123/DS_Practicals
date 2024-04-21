import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String serverURL = "rmi://localhost/Server";
            //Typecast
            ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);

            System.out.print("Enter 1st number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter 2nd number: ");
            double num2 = sc.nextDouble();

            System.out.print("1st no is : "+num1);
            System.out.print("1st no is : "+num1);

            System.out.println("-----------Results---------------");

            System.out.println("Addition is : "+serverIntf.addition(num1, num2));
            System.out.println("Substraction is : "+serverIntf.substraction(num1, num2));
            System.out.println("Division is : "+serverIntf.Division(num1, num2));

        }catch(Exception e){
            System.out.println("Exception Occured at Client!"+ e.getMessage());
        }
    }
}
