package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Retangulo extends Forma{

    private double largura;
    private double altura;

    public Retangulo(){
    }

    public Retangulo(Tipo tipo, double largura, double altura) {
        super(tipo);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        System.out.println(getTipo());
        return largura * altura;
    }
}
