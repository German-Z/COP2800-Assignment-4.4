import java.util.*;

public class HexagonArea {
    public static void main(String[] args) {
        //Instantiate scanner class
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the side of a hexagon
        System.out.print("Enter the side of a hexagon to find its area (e.g. 4.5): ");
        // Prompt user to input numbers if they don't enter numeric values
        if (!input.hasNextDouble()) {
            System.out.println("Please enter a numeric value (e.g 5)");
            input.close();
            return;
        }
        double side = input.nextDouble();
        // calculate side of hexagon
        double hexagonArea = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        // Display results
        System.out.printf("The area of the hexagon is %.2f%n", hexagonArea);
        input.close();
    }

}
