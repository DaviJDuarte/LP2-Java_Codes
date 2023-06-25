// Exercicio 3: Escreva o código fonte de um programa Java que crie 10 números aleatórios entre 1 e 100, ordene os valores de forma crescente, e grave os valores pares no arquivo “pares.txt” e os número impares no arquivo “impares.txt”.

import java.util.Random;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exercicio3 {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] numbers = new Integer[10];

        FileOutputStream out1 = null;
        FileOutputStream out2 = null;

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(101);
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }

        try {
            out1 = new FileOutputStream("pares.txt");
            out2 = new FileOutputStream("impares.txt");

            for (int i = 0; i < 10; i++) {
                try {
                    if (numbers[i] % 2 == 0) {
                        out1.write((numbers[i] + "\n").getBytes());
                    } else {
                        out2.write((numbers[i] + "\n").getBytes());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out1 != null)
                    out1.close();
                if (out2 != null)
                    out2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

