/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author angel
 */
public class Circulo {
    private float radio;
    
    /**
     * Constructo vacio
     */
    public Circulo() {
    }

    /**
     * metrodo para obtener el perimetro de un circulo
     * @return (float) (2*Math.PI*radio);
     */
    public float perimetro(){
        return (float) (2*Math.PI*radio);
    }
    
    /**
     * metodo para el area de un circulo
     * @return (float) (Math.PI*radio*radio);
     */
    public float are(){
        return (float) (Math.PI*radio*radio);
    }
    
    /**
     * Obtiene los valores que se le asignen a radio
     * @return radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Asigna valores a el atributo radio
     * @param radio atributo de tipo int parara darle el valor del radio de un circulo
     */
    public void setRadio(float radio) {
        if(radio<0){
            this.radio = Math.abs(radio);
            //this.radio = 0;
        }else{
            this.radio = radio;
        }
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
