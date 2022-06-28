package com.company;

public class Distribuidora {

    public static void main(String[] args) {
	    /*PraticaExcecoes teste1 = new PraticaExcecoes();
	    teste1.Teste();*/

        Pereciveis perecivel1 = new Pereciveis("Banana", 0.50, 1);
        NaoPereciveis naoPerecivel1 = new NaoPereciveis("Agua Sanitaria", 5.00, "Limpeza");

        System.out.println(perecivel1.calcular(5));
        System.out.println(naoPerecivel1.calcular(5));

        Produto[] produtos = {perecivel1, naoPerecivel1};

        System.out.println(perecivel1);
        System.out.println(naoPerecivel1);
    }
}
