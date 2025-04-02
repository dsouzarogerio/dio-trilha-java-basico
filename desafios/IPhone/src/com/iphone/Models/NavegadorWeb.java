package com.iphone.Models;

import com.iphone.Models.Interfaces.IPhone;

public class NavegadorWeb extends IPhone {

    public void exibirPagina(String url){

        System.out.println("Acessando página web: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova Aba");
    }

    public void atualizarPagina(){

        System.out.println("Atualizando página");
    }

}
