package br.com.letscode.turmaitau.carros;

import java.util.Arrays;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new  Carro(
                "Audi",
                "A1",
                "XYZ12345",
                "Branco",
                "2020"
        )

        Carro nissan = new Carro(
                "Nissan",
                "March",
                "ABC12345",
                 "Branco",
                 "2020"
        )




        //criacao do objeto carro audi
 //       Carro audi = new Carro();
//        audi.setModelo("A1");
//        audi.setMarca("Audi");
//        audi.setCor("Branco");
//        audi.setAnoFabricacao(2020);
//        audi.setPlaca("XYZ12345");
        //acelerando o carro audi
        audi.ligar();
        audi.acelerar();

        //criacao do objeto carro nissao
 //       Carro nissan = new Carro();
 //       nissan.setModelo("March");
//        nissan.setMarca("Nissan");
 //       nissan.setCor("Branco");
 //       nissan.setAnoFabricacao(2020);
//        nissan.setPlaca("ABC12345");
        //acelerando o carro nissan
//        nissan.acelerar();
  //      nissan.acelerar();

        System.out.println("audi = " + audi.toString());
        System.out.println("nissan = " + nissan);

        //mudando o modelo, ou seja, mudando o estado do meu objeto
        audi.setModelo("A2");
        nissan.setModelo( "Versa");

        System.out.println("audi = " + audi);
        System.out.println("nissan = " + nissan);

        System.out.println( "audi = nissan? " + nissan.equals(audi) );

        Carro golBranco = new Carro();
        golBranco.setModelo(new String("Gol"));

        Carro golPreto = new Carro();
        golPreto.setModelo("Gol");

        System.out.println( "modelo golBranco = golPreto? " + (golPreto.equals(golBranco) ));

        Integer i1 = 1;
        Integer ii1 = new Integer("1");

        //cuidado com a comparacao entre objetos
        System.out.println("i1 = " + i1);
        System.out.println("ii1 = " + ii1);
        System.out.println("== " + (ii1.intValue() == i1.intValue()) );
        System.out.println("== " + (ii1 == i1) );
        System.out.println("== " + ( ii1.equals(i1)) );

        audi.imprimirToString();

    }

}
