import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();

        do {
            System.out.println("Digite o " + (lista.size() + 1) + "º valor: ");
            Integer valor = sc.nextInt();
            lista.add(valor);
        } while (lista.size() < 5);

        System.out.println("\nValores: ");

        for (Integer i : lista)
            System.out.print(i + ", ");

        sc.close();

    }

}