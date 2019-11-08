/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author lab1
 */
public class Triangulo extends Figura {
    
     public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
       
    }

    @Override
    public float calcularArea() {
        return base*altura/2;
    }

    @Override
    public float calcularPerimetro() {
        return base*3;
    }
    
}
