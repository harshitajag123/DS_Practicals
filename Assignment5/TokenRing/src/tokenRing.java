import java.util.Scanner;
// import java.util.*;

public class tokenRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes u want int the ring : ");
        int n = sc.nextInt();

        System.out.println("Ring Formed is as below:  : ");

        for(int i=0; i<n; i++){
            System.out.print(i + " ");
        }

        System.out.print("0");
        System.out.println();

        int choice = 0;

        do{
            System.out.println("Enter Sender : ");
            int sender = sc.nextInt();

            System.out.println("Enter Receiver : ");
            int receiver = sc.nextInt();

            System.out.println("Enter data to send : ");
            int data = sc.nextInt();

            int token = 0;

            System.out.print("Token Passing : ");
            for(int i = token; i<sender; i++){
                System.out.print(" " + i+ "->");
            }

            System.out.println(" "+ sender);
            System.out.println("Sender: "+ sender+" Sending Data: "+data);

            for(int i = sender ; i!=receiver;i=(i+1)%n){
                System.out.println("Data: " +data + " Forwarded by : "+i);
            }
            System.out.println("Receiver : "+receiver+" Received the data: "+data);

            token =  sender;

            System.out.println("Do u want to send data again? If YES enter 1, If NO enter 0");
            choice = sc.nextInt();

        }while(choice == 1);


    }
}
