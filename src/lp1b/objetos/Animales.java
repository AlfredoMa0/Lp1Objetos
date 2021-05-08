/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1b.objetos;

/**
 *
 * @author Campe
 */
public class Animales {
    //CREA OBJETOS AUN NO HACE NADA 
    private String Tipo;
    private String raza;
    private String color;
    private int edad;
    private double altura;
    private double peso;
    private char sexo;

    public Animales(String Tipo, String raza, String color, int edad, double altura, double peso, char sexo) {
        this.Tipo = Tipo; //CREAR UN CONSTRUCTOR LLENO
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Animales() {
        // CONSTRUCTOR VACIO 
    }

    

    public String getTipo() { //COLOCAR 
        return Tipo;
    }

    public void setTipo(String Tipo) { //OBTENER
        this.Tipo = Tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void comer(){
        System.out.println("EL ANIMAL ESTA COMIENDO");
    }
    public void levantarse(){
        System.out.println("EL ANIMAL SE ESTA LEVANTANDO");
    }
    public void dormir(){
        System.out.println("EL ANIMAL  ESTA DURMIENDO");
    }

    @Override
    public String toString() {
        return "Animales{" + "Tipo=" + Tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + '}';
    }

   
    
}
