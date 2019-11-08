
package negocio;

/**
 *
 * @author dreis
 */
public class Retangulo extends Figura{

    @Override
    public void calcularArea(float base, float altura) {
        area = base * altura;
    }

    @Override
    public void calcularPerimetro(float base, float altura) {
        perimetro = (base + altura) * 2;
    }
    
}
