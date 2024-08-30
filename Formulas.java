
/**
 * public class Formulas
 *  
 * Author:  Evan Kniffen 
 * Date:    09/05/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Determines the values of ten different conversions.
 *
 */
 import java.util.Scanner;

 public class Formulas
{
   public static void main(String[] args)
   {
      Scanner ek = new Scanner(System.in);
      
      double lbs, kgs;
      System.out.println("Pounds to Kilograms");
      System.out.print("Enter the pounds: ");
      lbs = ek.nextDouble();
      kgs = lbs*0.453515;
      double rKgs = (int)kgs + ((int)(((kgs-(int)kgs) * 100) + 0.5) / 100.0);
      System.out.println(lbs + " pounds = "+ rKgs+" kilograms");
      System.out.println();
      
      double fahrenheit, celcius;
      System.out.println("Fahrenheit to Celcius");
      System.out.print("Enter the temperature in Fahrenheit: ");
      fahrenheit = ek.nextDouble();
      celcius = (fahrenheit - 32.0) * (5.0/9.0);
      double rCelcius = (int)celcius + ((int)(((celcius-(int)celcius) * 100) + 0.5) / 100.0);
      System.out.println(fahrenheit + " degrees Fahrenheit = "+ rCelcius +" degrees Celcius");
      System.out.println();
      
      double mph, knot;
      System.out.println("Miles per Hour to Knots");
      System.out.print("Enter the speed in Miles Per Hour: ");
      mph = ek.nextDouble();
      knot = mph / 1.151;
      double rKnot = (int)knot + ((int)(((knot-(int)knot) * 100) + 0.5) / 100.0);     
      System.out.println(mph + " miles per hour = "+ rKnot +" knots");
      System.out.println();
            
      double gallon, quart;
      System.out.println("Gallons to Quarts");
      System.out.print("Enter the volume in gallons: ");
      gallon = ek.nextDouble();
      quart = gallon * 4;
      double rQuart = (int)quart + ((int)(((quart-(int)quart) * 100) + 0.5) / 100.0);
      System.out.println(gallon + " gallons = "+ rQuart +" quarts");
      System.out.println();
             
      double deg, rad;
      final double PI = 3.14159265359;
      System.out.println("Degrees to Radians");
      System.out.print("Enter the degree value: ");
      deg = ek.nextDouble();
      rad = deg * (PI / 180);
      double rRad = (int)rad + ((int)(((rad-(int)rad) * 100) + 0.5) / 100.0);
      System.out.println(deg + " degrees = "+ rRad +" radians");
      System.out.println();
      
      double bit, bytes;
      System.out.println("Bits to Bytes");
      System.out.print("Enter the number of bits: ");
      bit = ek.nextDouble();
      bytes = bit / 8;
      double rBytes = (int)bytes + ((int)(((bytes-(int)bytes) * 100) + 0.5) / 100.0);
      System.out.println(bit + " bits = "+ rBytes +" bytes");
      System.out.println();
      
      double ft, yard;
      System.out.println("Feet to Yards");
      System.out.print("Enter the length in feet: ");
      ft = ek.nextDouble();
      yard = ft / 3;
      double rYard = (int)yard + ((int)(((yard-(int)yard) * 100) + 0.5) / 100.0);
      System.out.println(ft + " feet = "+ rYard +" yards");
      System.out.println();
      
      double m, cm;
      System.out.println("Centimeters to Meters");
      System.out.print("Enter the length in centimeters: ");
      cm = ek.nextDouble();
      m = cm / 100;
      double rM = (int)m + ((int)(((m-(int)m) * 100) + 0.5) / 100.0);;
      System.out.println(cm + " centimeters = "+ rM +" meters");
      System.out.println();
      
      double joule, cal;
      System.out.println("Joules to Calories");
      System.out.print("Enter the energy in joules: ");
      joule = ek.nextDouble();
      cal = joule / 4.184;
      double rCal = (int)cal + ((int)(((cal-(int)cal) * 100) + 0.5) / 100.0);
      System.out.println(joule + " joules = "+ rCal +" calories");
      System.out.println();
       
      double acre, sqft;
      System.out.println("Square Feet to Acres");
      System.out.print("Enter the area in square feet: ");
      sqft = ek.nextDouble();
      acre = sqft / 43560;
      double rAcre = (int)acre + ((int)(((acre-(int)acre) * 100) + 0.5) / 100.0);
      System.out.println(sqft + " square feet = "+ rAcre +" acres");
      System.out.println();

   }
}
