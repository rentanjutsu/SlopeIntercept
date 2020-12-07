import java.util.Scanner;
   
   public class SlopeIntercept {
      public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      //int slope = ((y2 - y1)/(x2 - x1));
      //int y1intercept = y1 - slope * x1;
      //int x1intercept = -1 * (y1intercept / slope);
         {//Prompt the user for starting point coordinates
         System.out.print("Enter the X and Y coordinates of starting point:\n\tx1 = ");
         x1 = userInput.nextDouble();
         System.out.print("\ty1 = ");
         y1 = userInput.nextDouble();
         }
         {//Promt the user for ending point coordinates
         System.out.print("Enter the X and Y coordinates of ending point:\n\tx2 = ");
         x2 = userInput.nextDouble();
         System.out.print("\ty2 = ");
         y2 = userInput.nextDouble();
         }
         double slope = ((y2 - y1)/(x2 - x1));
         double y1intercept = (y1 - slope * x1);
         double x1intercept = (-1 * (y1intercept / slope));
         if (x1 == x2)
            System.out.print("Slope: \"undefined\"");
         else
            if (y1 == y2)
               System.out.print("Slope: " + slope +
               "\nY Intercept: " + y1intercept +
               "\nX Intercept: \"undefined\"");            
            else
               System.out.print("Slope: " + slope +
               "\nY Intercept: " + y1intercept +
               "\nX Intercept: " + x1intercept);
         }
      }
