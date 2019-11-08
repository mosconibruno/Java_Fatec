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
public class Massa implements IMassa{

    @Override
    public float converterQuiloParaLibra(float massa) {
        return massa * 2.2046f;
    }

    @Override
    public float converterLibraParaQuilo(float massa) {
        return massa / 2.2046f;
    }
}
