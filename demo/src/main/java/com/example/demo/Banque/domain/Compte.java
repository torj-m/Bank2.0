package com.example.demo.Banque.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private long Rib;
    @Column(nullable = false)
    private float solde;
    @Column(nullable = false)
    private String type;

    public Compte(long rib, float solde, String type) {
        Rib = rib;
        this.solde = solde;
        this.type = type;
    }

    public long getRib() {
        return Rib;
    }

    public void setRib(long rib) {
        Rib = rib;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "Rib=" + Rib +
                ", solde=" + solde +
                ", type='" + type + '\'' +
                '}';
    }
}

