package com.ferramentateoc.vidaconcurseiro;

import androidx.annotation.NonNull;

import java.util.Random;

public class RandomNum{
    //private int valor;

    public int randomNum(){
        //super();
        return geradorRandomico();
    }

    public int getValor() {

        return a;
    }

    private void setValor(){
             //this.valor = getValor();
    }
    int a;
    private int geradorRandomico(){

        Random random = new Random();
       do{
           a = random.nextInt() / 100000000;
       }while (a<1 && a>40);

        return a;
    }
}
