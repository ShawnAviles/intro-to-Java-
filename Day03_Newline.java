import java.util.Scanner;

public class Day03_Newline {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("String?");
      String a = input.nextLine();
      
      System.out.println("int?");
      int b = input.nextInt();
      
      input.nextLine();
      
      System.out.println("String?");
      String c = input.nextLine();
      
      System.out.println("Got input?");
      System.out.println(a + "; " + b + "; " + c);
    }     
}