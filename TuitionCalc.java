/*5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year.

In one year, the tuition will be $10,500.

Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.*/

public class TuitionCalc {

    public static void main(String[] args) {
        // Create Variables
        double initialTuition = 10000; 
        
        double increaseRate = 0.05; 
        
        double tuition = initialTuition;
        
        double totalCost = 0;

        // Calculate and display tuition for each of the ten years
        System.out.println("Tuition for each of the ten years:");
        
        
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * increaseRate; 
            System.out.printf("Year %d: $%.2f\n", year, tuition);
        }
    
        // Calculate the total cost of four years' worth of tuition after the tenth year
        for (int year = 1; year <= 4; year++) {
            tuition += tuition * increaseRate; 
            totalCost += tuition; 
        }

        // Print total cost of four years' worth of tuition after the tenth year
        System.out.printf("\nTotal cost of four years' worth of tuition after the tenth year: $%.2f\n", totalCost);
    }
}