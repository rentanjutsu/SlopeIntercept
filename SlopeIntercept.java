import java.util.Scanner;
   
   public class SlopeIntercept {
      public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int x1 = 0;
      int x2 = 0;
      int y1 = 0;
      int y2 = 0;
      int slope = ((y2 - y1)/(x2 - x1));
      int y1intercept = y1 - slope * x1;
      int x1intercept = -1 * (y1intercept / slope);
         {//Prompt the user for input
         System.out.print("Enter the X and Y coordinates of starting point:\n\tx1 = ");
         x1 = userInput.nextInt();
         System.out.print("\ty1 = ");
         y1 = userInput.nextInt();
         }
      }
   }