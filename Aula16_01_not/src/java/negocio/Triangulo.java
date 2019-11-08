
package negocio;

/**
 *
 * @author dreis
 */
public class Triangulo extends Figura{
    
    @Override
    public void calcularArea(float base, float altura) {
        area = base * altura / 2;
    }

    @Override
    public void calcularPerimetro(float base, float altura) {
        perimetro = base * 3;
    }
}