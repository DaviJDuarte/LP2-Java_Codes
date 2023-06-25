// Exercicio 1: Escreva o código fonte de um programa Java que solicite ao usuário o nome do arquivo de leitura, utilizando o tratamento de exceções para arquivos que não existem, caso o arquivo não exista o programa deve solicitar novamente ao usuário o nome do arquivo de leitura. O programa deve solicitar o nome do arquivo de leitura até receber um nome de arquivo que existe. Quando o programa receber um nome de arquivo que existe, deve imprimir na tela do computador os números inteiros que representam os bytes armazenados no arquivo.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        FileInputStream in = null;
        Scanner sc = new Scanner(System.in);
        String fileName = "";
        boolean sair = false;

        do {
            try {
                System.out.print("Digite o nome do arquivo: ");
                fileName = sc.nextLine();
                in = new FileInputStream(fileName);
                sair = true;

                int c = 0;
                while ((c = in.read()) != -1) {
                    System.out.println(c);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo '" + fileName + "' NÃO encontrado!\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!sair);

        System.out.println("\nArquivo '" + fileName + "' encontrado!");

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
