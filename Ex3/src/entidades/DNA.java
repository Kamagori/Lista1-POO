package entidades;

import java.util.Scanner;

public class DNA {
    char sequencia[] = new char[9];

    Scanner scanner = new Scanner(System.in);

    public DNA(){
        lerDNA();
    }

    public DNA(String sequencia) {
        for (int i = 0; i < 9; i++) {
            this.sequencia[i] = sequencia.charAt(i);
        }
    }

    public void lerDNA(){
        System.out.println("Digite a sequência de DNA (9 caracteres):");
        String input = scanner.nextLine();

        for (int i = 0; i < 9; i++) {
            sequencia[i] = input.charAt(i);
        }
    }

    public char[] getSequencia() {
        return sequencia;
    }

    public String toString() {
        return new String(sequencia);
    }

    public int obterFrequencia(char base) {
        int frequencia = 0;
        for (char c : sequencia) {
            if (c == base) {
                frequencia++;
            }
        }
        return frequencia;
    }

    public int verificarSimilaridade(DNA outraDNA) {
        char[] outraSequencia = outraDNA.getSequencia();
        int similaridade = 0;

        for (int i = 0; i < 9; i++) {
            if (sequencia[i] == outraSequencia[i]) {
                similaridade++;
            }
        }

        return similaridade;
    }

}