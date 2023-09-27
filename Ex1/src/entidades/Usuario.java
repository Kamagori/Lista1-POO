package entidades;

import java.util.Scanner;

import util.CondicionadorDeAr;

public class Usuario {
    public static void main(String[] args) throws Exception {
        CondicionadorDeAr uso = new CondicionadorDeAr();
        int temp = uso.getTermostato()-1;
        int temperaturaDesejada;

        uso.ligar();
        
        Scanner scanner = new Scanner(System.in);
        temperaturaDesejada = scanner.nextInt();

        for(int i = 0; i < temperaturaDesejada; i++){
            uso.aumentarTemperatura();
            temp += 1;
            if (temp == 28)
                break;
        }

        temp ++;
        
        System.out.println(" ");
        scanner.nextLine();
        temperaturaDesejada = scanner.nextInt();
        for(int i = 0; i < (28 - temperaturaDesejada); i++){
            uso.reduzirTemperatura();
            temp --;
            if (temp == 15)
                break;
        }

        System.out.println(" ");
        scanner.nextLine();
        temperaturaDesejada = scanner.nextInt();
        for(int i = 0; i < 10; i++){
            uso.aumentarTemperatura();
        }

        System.out.printf("A temperatura atual é de: %d ºC", uso.getTermostato());

        scanner.close();
    }
}
