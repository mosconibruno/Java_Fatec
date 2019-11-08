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
public class Calculo implements ICalculo{

    @Override
    public float somar(float a, float b) {
        return a+b;
    }

    @Override
    public float subtrair(float a, float b) {
        return a-b;
    }

    @Override
    public float multiplicar(float a, float b) {
        return a*b;
    }

    @Override
    public float dividir(float a, float b) {
        return a/b;
    }
    
}
