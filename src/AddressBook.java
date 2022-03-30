import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("WelCome to AddressBook");
        contactDetail();
    }
  static void contactDetail(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter FirstName");
       String FirstName = sc.next();
       System.out.println("Enter LastName");
       String LastName = sc.next();
       System.out.println("Enter City");
       String City = sc.next();
       System.out.println("Enter Address");
       String Address = sc.next();
       System.out.println("Enter ZipCode");
       int Zipcode = sc.nextInt();
       System.out.println("Enter State");
       String State = sc.next();
       System.out.println("Enter Phone Number");
       long Phone = sc.nextLong();
       System.out.println("Enter Email");
       String Email = sc.next();

   }
}
