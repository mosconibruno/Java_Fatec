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
    
   
    @Override
    public void calcularArea(float base, float altura) {
        area = base*altura;
    }

    @Override
    public void calcularPerimetro(float base, float altura) {
        perimetro = (base + altura) * 2;
    }
}
