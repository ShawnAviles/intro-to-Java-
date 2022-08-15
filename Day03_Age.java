import java.util.Scanner;

public class Day03_Age {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("What's your age?");
      int age = input.nextInt();
      
      if (age >= 20) {
            System.out.println("You are old.");
            //
            //
      }
      else if (age > 12) {
            System.out.println("You are a teen");
            //
            //
      }
      else {
            System.out.println("You are young");
            //
            //
      }
      
    }   
}