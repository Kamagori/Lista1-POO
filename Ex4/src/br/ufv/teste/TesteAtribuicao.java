package br.ufv.teste;

import br.ufv.universidade.*;

public class TesteAtribuicao {
    public static void main(String[] args) {

        Professor professor = new Professor("Marcos Biscotto de Oliveira", 4236);
        Disciplina disciplina = new Disciplina("Ciencia da Computacao", true);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        System.out.println("=============================================================");
        System.out.println(atribuicao.toString());
        System.out.println("=============================================================\n");

    }
}
