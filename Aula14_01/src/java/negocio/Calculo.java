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
public class Calculo implements ICalculo {

    float a, b, c;
    
    
    public Calculo(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
     
    public float getC() {
        return c;
    }
    
    @Override
    public void somar() {
        c = a+b;
    }

    @Override
    public void subtrair() {
        c = a-b;
    }

    @Override
    public void multiplicar() {
        c = a*b;
    }

    @Override
    public void dividir() {
        c = a/b;
    }

    
    
}
