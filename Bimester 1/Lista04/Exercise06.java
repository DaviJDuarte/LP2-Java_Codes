import java.util.ArrayList;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Enter the %d° number of List %d: ", j + 1, i + 1);

                int input = scan.nextInt();

                if (i == 0) {
                    numbers1.add(input);
                } else {
                    numbers2.add(input);
                }
            }
            System.out.println();
        }

        numbers1.retainAll(numbers2);

        System.out.println("The intersection between the two lists is: ");
        for (Integer numbers : numbers1) {
            System.out.print(numbers);
            System.out.print(" ");
        }

        scan.close();
    }
}
