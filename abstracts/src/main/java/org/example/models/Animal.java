package org.example.models;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // contrato
    // assinatura do metodo
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
