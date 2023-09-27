import java.util.Scanner;

import entidades.DNA;

public class TesteDNA {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas sequências de DNA você deseja comparar?");
        int numSequencias = scanner.nextInt();

        scanner.nextLine();

        DNA[] sequencias = new DNA[numSequencias];

        for (int i = 0; i < numSequencias; i++) {
            System.out.println("Digite a sequência de DNA " + (i + 1) + ":");
            String sequencia = scanner.nextLine();
            sequencias[i] = new DNA(sequencia);
        }

        for (int i = 0; i < numSequencias; i++) {
            for (int j = i + 1; j < numSequencias; j++) {
                int similaridade = sequencias[i].verificarSimilaridade(sequencias[j]);
                System.out.println("Similaridade entre Sequência " + (i + 1) + " e Sequência " + (j + 1) + ": " + similaridade);
            }
        }
    }
}




