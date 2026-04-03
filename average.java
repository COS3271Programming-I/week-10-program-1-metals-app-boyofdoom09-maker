package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter numbers (1-30). Type 'end' to finish:");

        while (numbers.size() < 30) {
            String input = scanner.next();
            
            if (input.equalsIgnoreCase("end")) {
                if (numbers.isEmpty()) {
                    System.out.println("Please enter at least one number first.");
                    continue;
                }
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'end'.");
            }
        }

        double average = getAverage(numbers);
        System.out.println("The average is: " + average);
   
    }

    public static double getAverage(List<Integer> list) {
        if (list.isEmpty()) return 0.0;
        int sum = 0;
        for (int n : list) sum += n;
        return (double) sum / list.size();
    }
}
