/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Eleve
 */
public class Client {

    private String identifiant;
    private String telephone;

    public Client(String identifiant, String telephone) {
        this.identifiant = identifiant;
        this.telephone = telephone;
    }

    public Client(String identifiant) {
        this.identifiant = identifiant;
    }
    

    public String getIdentifiant() {
        return identifiant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
