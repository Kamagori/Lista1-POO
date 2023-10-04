package ex5;

public class Teste {

    public static void main(String[] args) {
        String exemploSentenca = "Boa tarde, professor.";
        String exemploVerbo = "estudar";
        String exemploPalindromo = "arara";

        int vogais = Texto.contarVogais(exemploSentenca);
        String conjugacao = Texto.conjugarVerbo(exemploVerbo);
        String inverso = Texto.obterInverso(exemploSentenca);
        boolean palindromo = Texto.ePalindromo(exemploPalindromo);

        System.out.println("Numero de vogais da sentenca: " + vogais);
        System.out.println("\nConjugacao do verbo: \n" + conjugacao);
        System.out.println("\nInverso da sentenca: " + inverso);
        System.out.println("\nEh palindromo? " + palindromo);
    }
}
