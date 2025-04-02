package com.iphone.Models;

import com.iphone.Models.Interfaces.IPhone;

public class ReprodutorMusical extends IPhone {

    private void tocar(){

        System.out.println("Tocando música");
    }

    public void pausar(){

        System.out.println("Pausando musica");
    }

    public void selecionandoMusica(String musica){

        System.out.println("Musica selecionada");

        if(!musica.isEmpty()){
            tocar();
        }
    }
}
