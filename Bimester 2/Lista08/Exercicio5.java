// Exercicio 5: faça um programa utilizando o comando “for” que leia 10 números do
// teclado e armazene estes 10 números em um arquivo chamado “num.txt”.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileWriter out = null;

        try {
            out = new FileWriter("num.txt", true);

            for (int i = 1; i <= 10; i++) {

                System.out.println("Digite " + i + "º número: ");

                int c = sc.nextInt();
                out.write(String.valueOf(c));
                out.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            try {
                out.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
