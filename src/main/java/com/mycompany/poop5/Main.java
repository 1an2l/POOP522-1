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
public class Main {
    
    public static void main(String[] args) {
        /*
        ci.radio = 5;
        no tiene por que solo se puede desde la misma clase debido al private
        */
        
        /**
         * Asignación de valores con setters y recuperacion de valores con getters
         * @param cir objeto de la clase Circulo
         * @param setRadio asigna valores para el radio del circulo a el objeto cir
         * @param getRadio recupera el valor asignado al radio
        */
        System.out.println("\n####################getters y setters######################");
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float) 7.2);
        cir.setRadio(8.9f);
        cir.setRadio((float) 7.66);
        
        float var=5;
        cir.setRadio(var);
        
        //Metododox(var);
        //Metodox(cir.setRadio());
        
        cir.setRadio(-7);
        System.out.println(cir);
                
        /**
         * Representa una forma de composición en donde se crean dos objetos para su implementación
         * @param persona1 objeto de la clase Persona
         * @param fNac objeto de la clase Fecha
         * @param setNombre asigna valores de tipo String para el nombre del objeto persona1
         * @param setApellido asigna valores de tipo String para el apellido del objeto persona1
         * @param setNacimiento asigna valores de tipo int para la fecha de nacimiento de la clase Fecha para poder imprimirlo en el objeto Persona1
         */
        System.out.println("\n#####################Composición1#########################");
        Persona persona1 = new Persona();
        persona1.setNombre("Antonio");
        persona1.setApellido("Lopez");
        Fecha fNac = new Fecha(14,10,2021);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        /**
         * Representa una forma de composición en donde se crean dos objetos para su implementación declarando inicialmente los valores de cada objeto
         * @param persona2 objeto de la clase Persona
         * @param fNac2 objeto de la clase Fecha
         */
        
        System.out.println("\n#####################Composición2#########################");
        Fecha fNac2 = new Fecha(25,10,1999);//Declaracion de Fecha de nacimiento 
        Persona persona2 = new Persona("Ricado","Lopez",fNac2);
        System.out.println(persona2);
        
        /**
         * Representa una forma de composición en donde un objeto contiene todos los valores necesarios declarados inicialmente
         * @param persona3 objeto de la clase Persona
         */
        
        System.out.println("\n#####################Composición3#########################");
        Persona persona3 = new Persona("Liliana","Fuentes",22,04,1998);
        System.out.println(persona3);
        
        /**
         * Representa una actividad extra en donde se recupera una clase carro para implementar la composicion de unas personas en las cuales indica los lugares que ocupan 4 personas en el carro creado
         * @param carro objeto de la clase Carro
         * @param .lugaresDelCoche operador punto para mostrat los lugares que ocupan las cuatro personas definidas en el objeto carro
         */
        
        System.out.println("\n#####################Actividad Extra#########################");
        Carro carro = new Carro("Honda","Civic","plata",2021,10000,true,"Camilo","Castañeda",06,07,1994,"Luis","Sánchez",18,10,1986,"Carlos","Salinas",03,12,1974,"Franco","Escamilla",24,01,2002);
        System.out.println(carro);
        carro.lugaresDelCoche();
        
    //Getters Setters
    }
    
}
