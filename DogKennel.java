import java.util.Scanner;

public class DogKennel
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int dogsWeight;
      int numDays;
      final double pricePerPound = 0.50;
      System.out.print("\nWhat is your dogs weight? ");
      dogsWeight = input.nextInt();
      System.out.print("How many days? ");
      numDays = input.nextInt();
      System.out.print("\nThe total price for boarding your " + dogsWeight + " pound dog for " + numDays + " days is ");
      System.out.printf("$%,.2f.", (pricePerPound * dogsWeight * numDays)); 
      input.close();
      
   }
}
