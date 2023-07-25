import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Float> salaries = new ArrayList<Float>();

        float input = 0;
        while (input != -1) {
            System.out.println("Enter the gross salary: ");
            input = scan.nextFloat();

            if (input != -1)
                salaries.add(input);
        }

        System.out.println("Enter the readjustment value: ");
        float readjustment = scan.nextFloat();

        ListIterator<Float> iterator = salaries.listIterator();

        while (iterator.hasNext()) {
            iterator.set(iterator.next() + readjustment);
        }

        for (float salary : salaries) {
            System.out.printf("New Salary: %.2f\n", salary);
        }

        scan.close();
    }
}