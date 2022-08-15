import java.util.Scanner;

public class Day03_CarRental {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println ("What is the name of the first company?");
      String name1 = input.nextLine ();
      
      System.out.println ("What is the price to rent a vehicle per day?");
      Double costDay1 = input.nextDouble ();
      
      System.out.println ("What is the price per mile?");
      Double costMile1 = input.nextDouble ();
      
      input.nextLine();
      
      System.out.println ("What is the name of the second company?");
      String name2 = input.nextLine ();
      
      System.out.println ("What is the price to rent a vehicle per day?");
      Double costDay2 = input.nextDouble ();
      
      System.out.println ("What is the price per mile?");
      Double costMile2 = input.nextDouble ();
      
      System.out.println ("How many miles do you plan to drive?");
      int miles = input.nextInt ();
      
      double first = costDay1 + (costMile1 * miles);
      double second = costDay2 + (costMile2 * miles);
      
      System.out.println("\n");
      
      System.out.println (name1 + " will cost " + first);
      System.out.println (name2 + " will cost " + second);
      
      if (first > second) {
            System.out.println(name2 + " is cheaper.");
            //
            //
      }
      else if (second > first) {
            System.out.println(name1 + " is cheaper.");
            //
            //
      }
      else {
            System.out.println("Both " + name1 + " and " + name2 + " cost the same.");
            //
            //
      }
      
      System.out.println("Done");
      
    }   
}