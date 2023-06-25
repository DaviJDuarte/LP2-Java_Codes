// Exercicio 2: Escreva o código fonte de um programa Java leia o conteúdo do arquivo “entrada.txt” em formato de bytes. O programa deve analisar cada byte lido do arquivo, e gravar os bytes com valores maiores que 128 no arquivo “maior.txt” e os bytes com valores menores ou iguais a 128 no arquivo “menor.txt”.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out1 = null;
        FileOutputStream out2 = null;

        try {
            in = new FileInputStream("entrada.txt");

            int c;

            out1 = new FileOutputStream("maior.txt");
            out2 = new FileOutputStream("menor.txt");

            while ((c = in.read()) != -1) {
                if (c > 128) {

                    out1.write(c);
                } else {

                    out2.write(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out1.close();
                out2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}