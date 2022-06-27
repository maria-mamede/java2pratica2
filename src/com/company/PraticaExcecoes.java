package com.company;

public class PraticaExcecoes {
    int a = 0, b = 300, divisao;

    public void Teste(){
        try{
            if (a==0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.println("Não pode ser dividido por zero");
        } finally{
            System.out.println("Programa finalizado.");
        }
    }
}
