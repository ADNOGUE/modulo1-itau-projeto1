package br.com.letscode.turmaitau.carroHeranca;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    //se uso a classe Integer (classe wrapper de in) a inicializacao é sempre NULL
    private Integer anoFabricacao = null;

    //se uso o primitivo a inicializacao é sempre "= false", é mesma coisa que "boolean ligado = false;"
    boolean ligado;

    //se uso o primitivo a inicializacao é sempre "= 0", é mesma coisa que "int velocidade = 0;"
    private int velocidade;


    public Carro(String marca, String modelo, String placa, String Cor, Integer anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.setPlaca(placa);
        this.setCor(cor);
        this.anoFabricacao = anoFabricacao;


    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        if (!ligado) {
            this.velocidade = 0;
            this.ligado = true;
        }

    }

    private void acelerar() {
        if (ligado) {
            this.velocidade = this.velocidade + 10;
        }
    }

    private void desligar() {
        this.ligado = false;
    }

    protected void setVelocidade(Integer Velocidade) {
        this.velocidade = velocidade;
    }


}

