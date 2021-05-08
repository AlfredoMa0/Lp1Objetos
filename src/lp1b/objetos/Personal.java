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
public class Personal {
   private String Alumno;
   private String Intendencia;
   private String Nombre;
   private String Curp;
   private String Actividad;
   private int edad;
   private char sexo;

    public Personal() {
    }

    public Personal(String Alumno, String Intendencia, String Nombre, String Curp, String Actividad, int edad, char sexo) {
        this.Alumno = Alumno;
        this.Intendencia = Intendencia;
        this.Nombre = Nombre;
        this.Curp = Curp;
        this.Actividad = Actividad;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    

    public String getIntendencia() {
        return Intendencia;
    }

    public void setIntendencia(String Intendencia) {
        this.Intendencia = Intendencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void MAÑANA(){
        System.out.println("1.-ME OCUPO EN LAS CLASES");
    }
     public void TARDE(){
        System.out.println("2.-DESCANSO UN RATO");
    }
     public void NOCHE(){
        System.out.println("3.-ADELANTO TAREA Y ME DUERMO");
    }
     public void Datos(){
        System.out.println("---------DATOS PERSONALES-------");
    }

    @Override
    public String toString() {
        return "Personal{" + "Alumno=" + Alumno +  ", Intendencia=" + Intendencia + ", Nombre=" + Nombre + ", Curp=" + Curp + ", Actividad=" + Actividad + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
   
           
}
