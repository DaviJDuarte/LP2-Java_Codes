import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 0; i < 6; i++) {
            System.out.println("\nEnter the name: ");
            names.add(sc.nextLine());
        }

        Collections.sort(names);

        System.out.println("\nNames in alphabetical order: ");

        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
