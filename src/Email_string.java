import java.util.Scanner;

public class Email_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email  adderess=");
        String email=sc.nextLine();
         int i=email.indexOf("@");
         String username=email.substring(0,i);
         String Domain=email.substring(i+1,email.length());

        System.out.println(username);
        System.out.println(Domain);
        int j=Domain.indexOf(".");
        String name=Domain.substring(0, j);
        System.out.println(name.equals("gmail"));
    }
}
