package ex5;

public class Texto {

    public static int contarVogais(String sentenca){
        
        int numVogais = 0;
        String vogais = "aeiouAEIOU";
        
        for(int i = 0; i <sentenca.length(); i++){
            char caracter = sentenca.charAt(i);
            if(vogais.contains(String.valueOf(caracter))){
                numVogais ++;
            }
        }
        
        return numVogais;
    }
    
    public static String conjugarVerbo(String verbo){
        
        if (verbo.endsWith("ar") && verbo.length() > 2){
            String infinitivo = verbo.substring(0, verbo.length() - 2);
            return "Eu " + infinitivo + "o\nTu " + infinitivo + "as\nEle " + infinitivo + "a\nNos " + infinitivo + "amos\nVos " + infinitivo + "ais\nEles " + infinitivo + "am";
        }
        
        else
            return "Verbo invalido. Deve terminar em 'ar' e ter mais de 2 caracteres.";
    }
    
    public static String obterInverso(String sentenca){
        
        StringBuilder inverso = new StringBuilder();
        
        for (int i = sentenca.length() - 1; i >= 0; i--){
            inverso.append(sentenca.charAt(i));
        }
        
        return inverso.toString();
        
    }
    
    public static boolean ePalindromo(String teste){
        
        String palavra = teste.replaceAll("\\s", "").toLowerCase();
        String inverso = obterInverso(palavra);
        
        return palavra.equals(inverso);
    }
    
}
