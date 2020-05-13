import java.util.*;

public class SortingAssignment {
    public static void main(String[] arg) {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        // Add random numbers (between 1 and 100) into an array
        for (int i = 1; i <= 100; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            listOfNumbers.add(randomNumber);
        }
        System.out.println("Array: \n" + listOfNumbers);
        System.out.println("Size of Array: \n" + listOfNumbers.size());
        // Sort in ascending order
        Collections.sort(listOfNumbers);
        System.out.println("Ascending Array Sort \n" + listOfNumbers);
        // Sort in descending order
        Collections.sort(listOfNumbers);
        Collections.reverse(listOfNumbers);
        System.out.println("Descending Array Sort \n" + listOfNumbers);
    }
}