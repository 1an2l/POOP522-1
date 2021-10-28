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
public class Persona {
    /**
     * Atributos que contendra los constructores de la clase persona
     * 
     */
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    /**
     * Constructor vacio
     */
    public Persona() {
    }
    /**
     * Constructor para los atributos definidos
     * @param nombre atributo de tipo string para mostrar el nombre
     * @param apellido atributo de tipo String para mostrar el apellido
     * @param fNacimiento atributo de tipo Fecha para mostrar la fecha de nacimiento
     */

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Constructo para la compocisión donde se declara un solo objeto
     * @param nombre atributo de tipo string para mostrar el nombre
     * @param apellido atributo de tipo String para mostrar el apellido
       @param dia atributo de tipo int para mostrar el día de la fecha de nacimiento
     * @param mes atributo de tipo int para mostrar el mes de la fecha de nacimiento
     * @param anio atributo de tipo int para mostrar el día de la año de nacimiento
     */

    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        //Opcion 1
        //Fecha fecha3 = new Fecha(dia, mes, anio);
        //his.fNacimiento =fecha3;
        
        //Opcion 2
        //fNacimiento = new Fecha();
        //fNacimiento.setDia(dia);
        //fNacimiento.setMes(mes);
        //fNacimiento.setAnio(anio);
        
        //Opcion 3
        fNacimiento = new Fecha(dia,mes,anio);
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }


    
    

    

    
    
    
    
}
