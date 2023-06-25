// Exercício 3: escreva um programa em linguagem de programação Java que faça a leitura de um arquivo em formato texto. O programa deve informar a quantidade de vogais, a quantidade de consoantes e a quantidade de caracteres encontradas no arquivo em formato texto.

import java.io.FileReader;
import java.io.IOException;

public class Exercicio3 {
    public static void main(String[] args) {
        FileReader in = null;

        int vowel = 0;
        int conso = 0;
        int other = 0;

        try {
            in = new FileReader("exercicio3.txt");

            int c;

            while ((c = in.read()) != -1) {

                Character letra = (char) c;

                letra = Character.toLowerCase(letra);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    ++vowel;
                } else if (letra >= 'a' && letra <= 'z') {
                    ++conso;
                } else {
                    ++other;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int total = vowel + conso + other;

        System.out
                .println("Vogais = " + vowel + "\nConsoantes = " + conso + "\nOutros = " + other + "\nTotal: " + total);

    }
}
