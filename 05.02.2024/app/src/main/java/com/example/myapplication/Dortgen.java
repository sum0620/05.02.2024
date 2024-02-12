package com.example.myapplication;

public class Dortgen {
    public Integer kisaKenar;
    public Integer uzunKenar;

    public Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
    public Dortgen(Integer kenar){
        this.kisaKenar=kenar;
    }

    public Integer alanbul(){
        Integer alan;
        alan=kisaKenar*uzunKenar;
        return alan;
    }
}
