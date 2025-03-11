package com.screenmatch.calculations;

//classe para filtrar títulos por avaliaçãoes e criar uma recomendação
public class FilterRecomendation {

    public void filter(Rateable r) {
        if (r.getRating() >= 4) {
            System.out.println("Bem recomendado!");
        } else if (r.getRating() >= 2){
            System.out.println("Tendência!");
        } else {
            System.out.println("Pode melhorar");
        }
    }
}
