/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Eleve
 */
public class Professionnel extends Client{
    
    private String nomSociete;

    public Professionnel(String nomSociete, String identifiant, String telephone) {
        super(identifiant, telephone);
        this.nomSociete = nomSociete;
    }

    public Professionnel(String nomSociete, String identifiant) {
        super(identifiant);
        this.nomSociete = nomSociete;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }
    
    
    
}
