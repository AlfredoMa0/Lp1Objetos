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
public class EDIFICIO {
    private String campus;
    private String area;
    private int salones;
    private int baños;
    private String Lugar;
    private String Color;
    private boolean energia;

    public EDIFICIO() {
    }

    public EDIFICIO(String campus, String area, int salones, int baños, String Lugar, String Color, boolean energia) {
        this.campus = campus;
        this.area = area;
        this.salones = salones;
        this.baños = baños;
        this.Lugar = Lugar;
        this.Color = Color;
        this.energia = energia;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String areas) {
        this.area = areas;
    }

    public int getSalones() {
        return salones;
    }

    public void setSalones(int salones) {
        this.salones = salones;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }
    public void Diseño(){
        System.out.println("1.-ES UNA FACULTAD MUY BONITA");
    }
    public void Arquitectura(){
        System.out.println("2.-EXCELENTE VISTA DESDE LOS SALONES");
    }
    public void Horarios(){
        System.out.println("3.-TODO EL DIA ESTA EN FUNCIONAMIENTO ASTA LAS 11 DE LA NOCHE");
    }public void Reconocida(){
        System.out.println("--------UNIVERSIDAD PRESTIGIADA-------");
    }

    @Override
    public String toString() {
        return "EDIFICIO{" + "campus=" + campus + ", areas=" + area + ", salones=" + salones + ", ba\u00f1os=" + baños + ", Lugar=" + Lugar + ", Color=" + Color + ", energia=" + energia + '}';
    }
    
}
