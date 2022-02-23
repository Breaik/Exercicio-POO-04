package com.calculadora;

public class Cal implements calculadora{
    private boolean ligado;
    private float n1;
    //________________________________________________________

    public Cal(){
        this.ligado = false;
        this.n1 = 0;
    }
    //________________________________________________________

    public void resultado(){
       if (this.getLigado() == true){
           System.out.println("RESULTADO = "+this.getN1());}
       else if (this.getLigado() == false){
           System.out.println("DESLIGADA");
       }
    }
    public void status(){
        if (this.ligado){
            System.out.println("LIGADA");
            System.out.println(" "+this.getN1());
        } else if (this.ligado == false) {
            System.out.println("DESLIGADA");
        }
    }

    //_________________________________________________________

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void soma(float x) {
        if (this.getLigado() == true){this.setN1(getN1()+x);}
        else if (this.getLigado() == false){
            System.out.println("Impossível realizar operação");
        }
    }

    @Override
    public void subtracao(float x) {
        if (this.getLigado() == true){this.setN1(getN1()-x);}
        else if (this.getLigado() == false){
            System.out.println("Impossível realizar operação");
        }
    }

    @Override
    public void multiplicacao(float x) {
        if (this.getLigado() == true){this.setN1(getN1()*x);}
        else if (this.getLigado() == false){
            System.out.println("Impossível realizar operação");
        }
    }

    @Override
    public void divisao(float x) {
        if (this.getLigado() == true){this.setN1(getN1()/x);}
        else if (this.getLigado() == false){
            System.out.println("Impossível realizar operação");
        }
    }

    @Override
    public void um(float y) {
        if (this.getLigado()==true){this.n1 = y;}
        else {
            System.out.println("Calculadora está desligada!");
        }
    }

    //_________________________________________________________

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }
}
