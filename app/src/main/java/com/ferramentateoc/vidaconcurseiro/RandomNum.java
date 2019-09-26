package com.ferramentateoc.vidaconcurseiro;

import androidx.annotation.NonNull;

import java.util.Random;

public class RandomNum{
    //private int valor;

    public int randomNum(){
        //super();
        return geradorRandomico();
    }

    private int getValor() {

        return 0;
    }

    private void setValor(){
             //this.valor = getValor();
    }

    private int geradorRandomico(){
        int a;
        Random random = new Random();
       do{
           a = random.nextInt() / 100000000;
       }while (a<1 && a>40);

        return a;
    }
}
