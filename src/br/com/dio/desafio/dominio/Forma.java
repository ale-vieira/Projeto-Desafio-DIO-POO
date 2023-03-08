package br.com.dio.desafio.dominio;

import java.security.PrivateKey;

public abstract class Forma {

    private Tipo tipo;

    public Forma(){
    }

    public Forma(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();

}
