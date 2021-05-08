/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lp1b.objetos;

/**
 *
 * @author edgar
 */
public class Lp1bObjetos {
    public static int x = 10;
    
    public static void primermetodo(){
        System.out.println("Primer metodo");
    }

    public static void main(String[] args) {
         // Clases y objetos
        /*
        System.out.println(Lp1bObjetos.x);
        Lp1bObjetos.x = 20;
        System.out.println(Lp1bObjetos.x);
        primermetodo();
        Lp1bObjetos.primermetodo();    
        */
        //int[] arreglo = new int[2];
        
        /*
        operaciones calculadora = new operaciones();
        calculadora.setResultado(0);
        System.out.println("SUMA: ");
        calculadora.suma(5);
        System.out.println(calculadora.toString());
        calculadora.suma(15);
        System.out.println(calculadora.toString());
        calculadora.suma(10);
        System.out.println(calculadora.toString());
       
        System.out.println("RESTA: ");
        calculadora.resta(5);
        System.out.println(calculadora.toString());
        calculadora.resta(6);
        System.out.println(calculadora.toString());  
        System.out.println("MULTIPLICACION: ");
        calculadora.multiplicacion(5);
        System.out.println(calculadora.toString());
        calculadora.multiplicacion(7);
        System.out.println(calculadora.toString());
        
        operaciones cientifica = new operaciones(1);
        System.out.println(cientifica.toString());
        */
        /*
        Animales perro = new Animales();
        perro.setTipo("MAMIFERO");
        perro.setRaza("PERRO");
        perro.setColor("NEGRO");
        perro.setEdad(1);
        perro.setAltura(.60);
        perro.setPeso(5.5);
        perro.setSexo('M');
        
        System.out.println(perro.toString());
        perro.levantarse();
        
        Animales Pollo = new Animales();
        Pollo.setTipo("AVE");
        Pollo.setSexo('H');
        Pollo.setRaza("DE PELEA");
        Pollo.setPeso(.20);
        Pollo.setEdad(2);
        Pollo.setColor("AMARILLO");
        Pollo.setAltura(.30);
        
        System.out.println(Pollo.toString());
        Pollo.comer();
        
        Animales Murcielago = new Animales("AVE","MALANDRA","NEGRO",10,.10,.20,'M');
        System.out.println(Murcielago.toString());
        Murcielago.dormir();
        
       
        Animales Cocodrilo = new Animales("REPTIL","COMELON","VERDE",15,.50,.40,'H');
        System.out.println(Cocodrilo.toString());
        */
        System.out.println("  EJERCICIO 1 -PERSONAL- ");
        
        Personal Alfredo=new Personal();
        Alfredo.setSexo('H');
        Alfredo.setNombre("ALFREDO MAGAÑA");
        Alfredo.setIntendencia("ESTUDIANTE");
        Alfredo.setEdad(19);
        Alfredo.setCurp("MAAJ020328HCCGGSA5");
        Alfredo.setAlumno("ALFREDO");
        Alfredo.setActividad("DEPORTISTA");
        Alfredo.Datos();
        System.out.println(Alfredo.toString());
        Alfredo.MAÑANA();       
        Alfredo.TARDE();       
        Alfredo.NOCHE();
        
        System.out.println("EJERCICIO 2 -- EDIFICIO--");
       
        EDIFICIO A= new EDIFICIO("FACULTAD DE INGENIERIA","A",5,4,"EX HACIENDA KALA","AZUL CON BLANCO",true);
        A.Reconocida();
        System.out.println(A.toString());
        A.Diseño();
        A.Arquitectura();
        A.Horarios();
    }
    
}
