package com.company;

public class Pereciveis extends Produto{
    int diasParaVencer;

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int qtdProdutos){
        double precoFinal = 0;

        if (diasParaVencer==1){
            precoFinal = (qtdProdutos*getPreco())/4;
        } else if (diasParaVencer==2){
            precoFinal = (qtdProdutos*getPreco())/3;
        } else if (diasParaVencer==3){
            precoFinal = (qtdProdutos*getPreco())/2;
        }

        return precoFinal;
    }
}
