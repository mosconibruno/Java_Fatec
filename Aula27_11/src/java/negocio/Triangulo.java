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
    
    @Override
    public void calcularArea(float base, float altura) {
        area = base*altura/2;
    }

    @Override
    public void calcularPerimetro(float base, float altura) {
        perimetro = base*3;
    }

    
}
