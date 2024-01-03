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
public class Particulier extends Client{
    
    private String nom;
    private String prenom;

    public Particulier(String nom, String prenom, String identifiant, String telephone) {
        super(identifiant, telephone);
        this.nom = nom;
        this.prenom = prenom;
    }

    public Particulier(String nom, String prenom, String identifiant) {
        super(identifiant);
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
    
    
    
}
