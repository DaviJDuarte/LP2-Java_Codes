import java.util.ArrayList;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> even_numbers = new ArrayList<>();
        ArrayList<Integer> odd_numbers = new ArrayList<>();

        int input = 0;
        while (input != -1) {
            System.out.println("Enter a number: ");
            input = sc.nextInt();
            if (input != -1) {
                numbers.add(input);
            }
        }

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even_numbers.add(number);
            } else {
                odd_numbers.add(number);
            }
        }

        System.out.println("\nEven numbers: ");

        for (Integer number : even_numbers) {
            System.out.print(number);
            System.out.print(" ");
        }

        System.out.println("\n\nOdd numbers: ");

        for (Integer number : odd_numbers) {
            System.out.print(number);
            System.out.print(" ");
        }

        sc.close();

    }
}
