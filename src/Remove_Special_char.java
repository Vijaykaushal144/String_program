import java.util.Scanner;

public class Remove_Special_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string with special character=");
        String str= sc.nextLine();
        System.out.println(str.replaceAll("[^0-9a-zA-Z]",""));

    }
}
