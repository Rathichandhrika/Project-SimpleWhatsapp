import java.util.ArrayList;
import java.util.Scanner;
class User {
    String Name;
    String Ph_num;
    User(String Name,String Ph_num)
    {
        this.Name = Name;
        this.Ph_num = Ph_num;
    }
}
class Message {
    String Sender;
    String Receiver;
    String Content;
    Message(String Sender,String Receiver,String Content)
    {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Content = Content;
    }
    void display()
    {
        System.out.println(Sender+"-->"+Receiver+" : "+Content);
    }
}

public class Whatsapp {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name of User 1 : ");
        String name1 = scan.nextLine();
        System.out.print("Enter the Phone Number of User 1 : ");
        String phone1 = scan.nextLine();
        User user1 = new User(name1,phone1);

        System.out.print("Enter the Name of User 2 : ");
        String name2 = scan.nextLine();
        System.out.print("Enter the Phone Number of User 2 : ");
        String phone2 = scan.nextLine();
        User user2 = new User(name2,phone2);

        ArrayList<Message> messageList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n----Simple Whatsapp Messenger----");
            System.out.println("1.Send Message from "+user1.Name+" to "+user2.Name);
            System.out.println("2.Send Message from "+user2.Name+" to "+user1.Name);
            System.out.println("3.View Chat History");
            System.out.println("4.Exit");
            System.out.print("\nEnter your Choice : ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Message from " + user1.Name + " to " + user2.Name);
                    String msg1 = scan.nextLine();
                    messageList.add(new Message(user1.Name, user2.Name, msg1));
                    break;
                case 2:
                    System.out.println("Enter Message from " + user2.Name + " to " + user1.Name);
                    String msg2 = scan.nextLine();
                    messageList.add(new Message(user2.Name, user1.Name, msg2));
                    break;
                case 3:
                    System.out.println("\n----Chat History---");
                    for (Message m : messageList) {
                        m.display();
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again");
            }
        }
        while (choice!=4);
        scan.close();
    }
}
