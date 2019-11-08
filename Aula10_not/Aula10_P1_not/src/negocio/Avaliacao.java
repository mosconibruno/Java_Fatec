
package negocio;

/**
 *
 * @author dreis
 */
public class Avaliacao implements IMedia, IPresenca{

    private float mediaFinal, percentualPresenca;

    public float getMediaFinal() { return mediaFinal; }
    public float getPercentualPresenca() { return percentualPresenca; }
    
    public String retornarSituacao(){
        if (mediaFinal >= 6 && percentualPresenca >= 75)
            return "Aprovado";
        else
            return "Reprovado";
    }
    
    @Override
    public void calcularMedia(float p1, float p2) {
        mediaFinal = (p1 + p2)/2;
    }

    @Override
    public void calcularMedia(float p1, float p2, float p3) {
        mediaFinal = (p1 + p2 + p3)/3;
    }

    @Override
    public void calcularPercentualPresenca(float totalAulas, float qtdePresencas) {
        percentualPresenca = qtdePresencas / totalAulas * 100;
    }
    
}
