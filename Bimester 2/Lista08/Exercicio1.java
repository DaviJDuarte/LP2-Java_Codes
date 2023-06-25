// Exercicio 1: escreva o código fonte de um programa Java que leia uma mensagem enviada pelo usuário através do teclado e faça a gravação dos caracteres da mensagem em um arquivo em formato de texto.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        FileWriter out = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a mensagem: ");
        String message = sc.nextLine();

        try {
            out = new FileWriter("saida.txt");

            for (int i = 0; i < message.length(); ++i) {
                out.write(message.charAt(i));
            }
            System.out.println("\nArquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}