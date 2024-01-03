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
public class Table {
    
    private int numero;
    private int nbChaise;

    public Table(int numero, int nbChaise) {
        this.numero = numero;
        this.nbChaise = nbChaise;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbChaise() {
        return nbChaise;
    }

    public void setNbChaise(int nbChaise) {
        this.nbChaise = nbChaise;
    }
    
    
    
}
