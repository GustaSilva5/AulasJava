package Metodos;

public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando para o Canal " + canal);
    }
    public void diminuindoCanal(){
        canal--;
        System.out.println("Mudando para o Canal " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
        //volume = volume + 1;
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
        //volume = volume - 1;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}
