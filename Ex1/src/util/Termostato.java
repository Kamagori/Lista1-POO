package util;

public class Termostato {
    public int temperatura;

    public Termostato(){
        temperatura = 20;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura += temperatura;
    }

    
}

