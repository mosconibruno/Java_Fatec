
package negocio;

/**
 *
 * @author dreis
 */
public abstract class Figura implements IFigura{
    
    protected float area, perimetro;

    public float getArea() { return area; }
    public float getPerimetro() { return perimetro; }
}
