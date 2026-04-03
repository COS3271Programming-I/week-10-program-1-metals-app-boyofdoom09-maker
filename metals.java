package test;
import java.util.Scanner;
import java.io.File;
public class Im {
	
		public static double conversionCtoF(double celsius) {
	        return (celsius * 9.0 / 5.0) + 32;
	    }
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Input name of a metal");
		 String name = scanner.nextLine();     
		 System.out.println("Input density of your chosen metal");
		 int number = scanner.nextInt();       
		 System.out.println("Input melting point of your chosen metal");
		 double value = scanner.nextDouble();
		 
	        double tempC = 25;
	        double tempF = conversionCtoF(tempC);
	       

	        System.out.println("Celsius: " + tempC);
	        System.out.println("Fahrenheit: " + tempF);
	    }
	
		        }
