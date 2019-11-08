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
public class Formato {
    String texto;

    public Formato(String texto) {
        this.texto = texto;
    }
    public String retornarMaiusculo(){
        return texto.toUpperCase();
    }
    
    public String retornarMinusculo(){
     return texto.toLowerCase();
    }

}
