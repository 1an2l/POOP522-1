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
public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private int kilometraje;
    boolean estandar;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    

    public Carro() {
    }

    /**
     * Constructor para el objeto carro
     * @param marca atributo de tipo String que indica la marca del carro
     * @param modelo atributo de tipo String que indica la modelo del carro
     * @param color atributo de tipo String que indica la color del carro
     * @param año atributo de tipo int que indica el año del carro
     * @param kilometraje atributo de tipo int que indica el kilometraje del carro
     * @param estandar atributo de tipo boolean que indica la marca del carro
     */
    public Carro(String marca, String modelo, String color, int año, int kilometraje, boolean estandar) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
    }
    
    /**
     * Constructor para la actividad extra en donde asignamos los valores que tendran los objetos de la clase persona 
     */
    public Carro(String marca, String modelo, String color, int año, int kilometraje, boolean estandar, String nombre, String apellido, int dia, int mes, int anio, String nombre1, String apellido1, int dia1, int mes1, int anio1, String nombre2, String apellido2, int dia2, int mes2, int anio2, String nombre3, String apellido3, int dia3, int mes3, int anio3) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
        chofer = new Persona(nombre,apellido,dia,mes, anio);
        copiloto = new Persona(nombre1,apellido1,dia1,mes1, anio1);
        pasajero1 = new Persona(nombre2,apellido2,dia2,mes2, anio2);
        pasajero2 = new Persona(nombre3,apellido3,dia3,mes3, anio);
    }

    

    
    /**
     * Método para mostrar el lugar a donde se esta llegando con el coche
     * @param lugar representa el lugar donde se esta llegando con el carro
     */
    public void irAUnLugar(String lugar){
        System.out.println("Estoy llengo a "+lugar);
    }
    /**
     * Método para mostrar a quien se le vendio el coche
     * @param comprador representa quien es el comprador del carro
     */
    public void venderCarro(String comprador){
        System.out.println("Vendi mi coche a "+comprador);
    }
    
    /**
     * Método para nostrar que porcentaje de gasolina contiene el carro
     * @param porcentaje representa el porcentaje que se tiene de gasolina
     */
    public void gasolina(int porcentaje){
        System.out.println("Tengo "+porcentaje+" % de gasolina");
    }
    
    /**
     * Método para mostrar si necesita algun servicio el coche
     */
    public void servicio(){
        if(kilometraje > 50_000){
            System.out.println("El carro necesita llevarse al servicio");
        }
        else{
            System.out.println("Aún falta para ir a servicio, no te preocupes");
        }
    }
    /**
     * Metodo que muestra el tiempo de un trayecto realizado por el coche
     * @param tiempo representa el tiempo de trayecto
     */
    public void recorridoEnTiempo(float tiempo){
        System.out.println("El tiempo del trayecto es "+tiempo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstandar() {
        return estandar;
    }

    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    
    /**
     * Método para imprimir los lugares de un coche
     */
    public void lugaresDelCoche(){
        System.out.println("En este carro:");
        System.out.println("Soy el chofer "+chofer.getNombre()+" "+chofer.getApellido()+" y naci el dia "+chofer.getfNacimiento().getDia()+" del mes "+chofer.getfNacimiento().getMes()+" en el año de "+chofer.getfNacimiento().getAnio());
        System.out.println("Soy el copiloto "+copiloto.getNombre()+" "+copiloto.getApellido()+" y naci el dia "+copiloto.getfNacimiento().getDia()+" del mes "+copiloto.getfNacimiento().getMes()+" en el año de "+copiloto.getfNacimiento().getAnio());
        System.out.println("Soy el pasajero 1 "+pasajero1.getNombre()+" "+pasajero1.getApellido()+" y naci el dia "+pasajero1.getfNacimiento().getDia()+" del mes "+pasajero1.getfNacimiento().getMes()+" en el año de "+pasajero1.getfNacimiento().getAnio());
        System.out.println("Soy el pasajero 2 "+pasajero2.getNombre()+" "+pasajero2.getApellido()+" y naci el dia "+pasajero2.getfNacimiento().getDia()+" del mes "+pasajero2.getfNacimiento().getMes()+" en el año de "+pasajero2.getfNacimiento().getAnio());
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", a\u00f1o=" + año + ", kilometraje=" + kilometraje + ", estandar=" + estandar + '}';
    }

    
    
    

    

    

    

    
 
}
