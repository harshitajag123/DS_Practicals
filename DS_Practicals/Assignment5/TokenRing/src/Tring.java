import java.util.Scanner;


public class Tring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of nodes : ");
        int n = sc.nextInt();

        System.out.println("Ring formed is as follows: ");
        for(int i = 0; i<n; i++){
            System.out.print(i + "  ");
        }
        System.out.print("0");
        System.out.println();

        int choice = 0;

        do{
            System.out.println("Enter sender: ");
            int sender = sc.nextInt();

            System.out.println("Enter receiver: ");
            int receiver = sc.nextInt();


            System.out.println("Enter data: ");
            int data = sc.nextInt();

            System.out.println("Token Passing: ");

            int token = 0 ;

            for(int i = token; i<sender; i++)
            {
                System.out.print("  " + i+ " -> ");
            }

            System.out.print(" "+sender);
            System.out.println();
            System.out.println("Sender is  "+ sender+ " Sending data : "+ data);

            for(int i = sender; i!=receiver; i = (i+1)%n){
                System.out.println("Data " + data + " Forwarded by "+ i);
            }

            System.out.println("Receiver : "+receiver + " received the data: "+ data);
            token = sender;

            System.out.println("Do u want to send data again? If YES , enter 1; If NO eneter 0 ");
            choice = sc.nextInt();

        

        }while(choice ==1);

    }
    
}
