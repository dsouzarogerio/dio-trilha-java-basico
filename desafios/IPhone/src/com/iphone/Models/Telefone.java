package com.iphone.Models;

import com.iphone.Models.Interfaces.IPhone;

public class Telefone extends IPhone {

    public void ligarParaNumero(String numero){

        System.out.println("Ligando para numero " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando Correio de Voz");
    }

}
