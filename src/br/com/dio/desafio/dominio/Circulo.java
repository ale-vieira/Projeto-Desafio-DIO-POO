package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Circulo extends Forma{

    private double raio;

   public Circulo(){

   }

    public Circulo(Tipo tipo, double raio) {
        super(tipo);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        System.out.println(getTipo());
        return Math.PI * raio * raio;
    }
}
