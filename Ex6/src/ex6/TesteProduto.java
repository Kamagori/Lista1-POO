package ex6;

public class TesteProduto {
    public static void main(String[] args) {
        // Leitura dos dados do primeiro produto
        String nomeProduto1 = "Juuj";
        double precoProduto1 = 14.99;
        String marcaEtiqueta1 = "Philiper's";
        String tamanhoEtiqueta1 = "M";

        // Instanciar o primeiro produto usando o construtor que recebe nome, preço, marca e tamanho da etiqueta
        Produto produto1 = new Produto(nomeProduto1, precoProduto1, marcaEtiqueta1, tamanhoEtiqueta1);

        // Exibir os atributos do primeiro produto
        System.out.println("Dados do Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: " + produto1.getPreco());
        System.out.println("Marca da Etiqueta: " + produto1.getEtiqueta().getMarca());
        System.out.println("Tamanho da Etiqueta: " + produto1.getEtiqueta().getTamanho());

        // Leitura dos dados do segundo produto
        String nomeProduto2 = "Zeez";
        double precoProduto2 = 24.99;
        String marcaEtiqueta2 = "Nacifer's";
        String tamanhoEtiqueta2 = "PP";

        // Instanciar o segundo produto usando o construtor que recebe nome, preço e um objeto Etiqueta
        Etiqueta etiqueta2 = new Etiqueta(marcaEtiqueta2, tamanhoEtiqueta2);
        Produto produto2 = new Produto(nomeProduto2, precoProduto2, etiqueta2);

        // Exibir os atributos do segundo produto
        System.out.println("\nDados do Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preco: " + produto2.getPreco());
        System.out.println("Marca da Etiqueta: " + produto2.getEtiqueta().getMarca());
        System.out.println("Tamanho da Etiqueta: " + produto2.getEtiqueta().getTamanho());

        // Alterar os atributos do primeiro produto
        produto1.setNome("Saas");
        produto1.setPreco(49.99);
        produto1.getEtiqueta().setMarca("SECOMZER'S");
        produto1.getEtiqueta().setTamanho("GG");

        // Exibir os atributos do primeiro produto após a alteração
        System.out.println("\nDados do Produto 1 apos a alteracao:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: " + produto1.getPreco());
        System.out.println("Marca da Etiqueta: " + produto1.getEtiqueta().getMarca());
        System.out.println("Tamanho da Etiqueta: " + produto1.getEtiqueta().getTamanho());
    }
}