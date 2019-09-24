package com.ferramentateoc.vidaconcurseiro;

import java.util.Random;

public class RandomNum extends Random {
    private int valor;

    public int getValor() {
        return valor;
    }

    private void setValor(int a){
        this.valor =  a;
    }

    public int gergadorNumerico(){
        int a;
       do{
           a = this.nextInt() / 100000000;
       }while (a<1);
        setValor(a);
        return getValor();
    }
}
