import java.util.Scanner;

import entidades.DNA;

public class TesteDNA {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas sequências de DNA você deseja verificar?");
        int numSequencias = scanner.nextInt();
        System.out.println("");

        scanner.nextLine();

        for (int i = 0; i < numSequencias; i++) {
            DNA dna = new DNA();
            char[] sequenciaDNA = dna.getSequencia();
            int frequenciaAdenina = dna.obterFrequencia('A');

            if (frequenciaAdenina > 2) {
                System.out.println("Sequência " + (i + 1) + ": " + dna.toString() + " (Adenina aparece mais de 2 vezes)");
            } else {
                System.out.println("Sequência " + (i + 1) + ": " + dna.toString() + " (Adenina não aparece mais de 2 vezes)");
            }
            System.out.println("Digite a base para verificar a frequência (A, T, C ou G):");
            char baseDesejada = scanner.nextLine().charAt(0);
            int frequenciaBase = dna.obterFrequencia(baseDesejada);
            System.out.println("Sequência " + (i + 1) + ": " + dna.toString() + " (Frequência de " + baseDesejada + ": " + frequenciaBase + ")\n");
        }   
        scanner.close();
    }
}