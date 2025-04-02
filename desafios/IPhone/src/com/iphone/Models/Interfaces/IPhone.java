package com.iphone.Models.Interfaces;

public class IPhone {

    public boolean isLigado(){
        return true;
    }

    public void desligar(){
        if(isLigado()){
            System.out.println("Desligando telefone");
        }
    }
}
