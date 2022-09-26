package com.coches;


//Si la declaramos Abstracta no se podrá instanciar, solo servirá para que la hereden las clases Hijas
//abstract
public class Coche {
    //Atributos
    int numRuedas;
    String color;
    int numPlazas;

    public Coche(int numRuedas, String color, int numPlazas)
    {
        this.color = color;
        this.numRuedas = 4;
        this.numPlazas = 4;
    }

    public void añadirMatizAColor(String matiz)
    {
        this.color += "con matices de " + matiz;
    }

}
