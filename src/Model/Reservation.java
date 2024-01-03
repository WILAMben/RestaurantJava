/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Eleve
 */
public class Reservation {
    
    private int numero;
    private int nbPersonne;
    private Date dateDebut;
    private Date dateFin;
    private Client client;
    private Table table;

    public Reservation(int numero, int nbPersonne, Date dateDebut, Date dateFin, Client client, Table table) {
        this.numero = numero;
        this.nbPersonne = nbPersonne;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.table = table;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    
    
}
