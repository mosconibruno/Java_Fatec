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
public class Retangulo extends Figura {
    
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calcularPerimetro(){
        return (base + altura) * 2;   
    }
    
}
