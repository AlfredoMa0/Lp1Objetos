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
public class operaciones {
    private int resultado;

    public operaciones() {//VACIO
    }
    public operaciones(int resultado) {
        this.resultado = resultado;
    }
    public int getResultado() {//OBTENER
        return resultado;
    }
    public void setResultado(int resultado) {//ASIGNAR
        this.resultado = resultado;
    }
    public void suma(int valor) {
        this.resultado = resultado+valor;
    }
     public void resta(int valor) {
        this.resultado = resultado-valor;
    }
     public void multiplicacion(int valor) {
        this.resultado = resultado*valor;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "resultado=" + resultado + '}';
    }
    
}
