import java.util.Scanner;

public class Count_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word=");
        String str= sc.nextLine();
        str=str.replaceAll("\\s+"," ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);


    }
}

