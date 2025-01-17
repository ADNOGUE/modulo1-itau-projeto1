package br.com.letscode.turmaitau.carros;

import java.util.Arrays;

public class CarroMain2 {

    public static void main(String[] args) {

        Carro golBranco = new Carro();
        golBranco.setModelo(new String("Gol"));
        //se incluir a cor os objetos ficam diferentes
        //golBranco.cor = "Branco";

        Carro golPreto = new Carro();
        golPreto.setModelo("Gol");
        //se incluir a cor os objetos ficam diferentes
        //golPreto.cor = "Preto";

        golBranco.imprimirToString();
        golPreto.imprimirToString();

        if ( golPreto.equals(golBranco) ) { //comparacao de objetos
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( golPreto == golBranco ) { // CUIDADO!! comparacao de referencia de memoria
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( golPreto.toString().equals(golBranco.toString()) ) { //comparacao do toString
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( golPreto.hashCode() == golBranco.hashCode() ) { // comparacao de hashCode
            System.out.println("hash sao iguais");
        } else {
            System.out.println("sao diferentes");
        }

        if ( golBranco instanceof Carro ) {
            System.out.println("golBranco é um carro");
        }

        if ( golPreto instanceof Carro ) {
            System.out.println("golPreto é um carro");
        }

        if ( golBranco instanceof Object ) {
            System.out.println("golBranco é um Object");
        }

        String teste = "Teste";
        if ( teste instanceof Object ) {
            System.out.println("teste é um Object");
        }


    }

}
