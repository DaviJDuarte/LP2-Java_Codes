// Exercício 4: faça um programa que leia 4 notas de um arquivo chamado “notas.txt”, calcula a média destas notas, imprime a média destas notas e salva a média no final deste mesmo arquivo.

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        String notas = "";
        double[] notasNum = new double[4];
        int i = 0;
        Double media = 0.0;

        try {
            in = new FileReader("notas.txt");

            int c;

            while ((c = in.read()) != -1) {
                notas += (char) c;
            }

            StringTokenizer notasToken = new StringTokenizer(notas);

            while (notasToken.hasMoreTokens()) {
                notasNum[i] = Double.parseDouble(notasToken.nextToken());
                ++i;
            }

            for (i = 0; i < 4; ++i) {
                media += notasNum[i];
            }

            media = media / 4;
            String medias = String.format(Locale.US, "%.2f", media);

            out = new FileWriter("notas.txt", true);
            out.write("\nMédia: " + medias);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
