package com.example.demo.Banque.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Siege extends Banque{
    @Column(nullable = false)
    private String localisation;

    public Siege(String idB, String nomB, String adresse, String localisation) {
        super(idB, nomB, adresse);
        this.localisation = localisation;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "Siege{" +
                "idB='" + idB + '\'' +
                ", nomB='" + nomB + '\'' +
                ", adresse='" + adresse + '\'' +
                ", localisation='" + localisation + '\'' +
                '}';
    }
}
