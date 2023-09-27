package util;

import util.Termostato;

public class CondicionadorDeAr{
    private boolean ligado;
    private Termostato termostato;

    public CondicionadorDeAr(){
        termostato = new Termostato();
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getTermostato() {
        return termostato.getTemperatura();
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }


    public void aumentarTemperatura(){
        if(ligado == true){
            if (termostato.getTemperatura() == 28){
                System.out.println("Impossível aumentar a temperatura para além de 28 ºC.");
        }
            else 
                termostato.setTemperatura(1);
        }
        else
                System.out.println("Por favor, ligue o condicionador de ar.");

    }

    public void reduzirTemperatura(){
        if(ligado = true){
            if (termostato.getTemperatura() == 15){
                System.out.println("Impossível abaixar a temperatura para abaixo de 15 ºC.");
        }
            else 
                termostato.setTemperatura(-1);
        }
        else
            System.out.println("Por favor, ligue o condicionador de ar.");
    }
    

}