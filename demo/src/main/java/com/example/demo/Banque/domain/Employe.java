package com.example.demo.Banque.domain;

import javax.persistence.*;

@Entity
@Table
public class Employe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private String idEmp;
    @Column(nullable = false)
    private String nomEmp;
    @Column(nullable = false)
    private String prenomEmp;
    @Column
    private String adresse;
    @Column(nullable = false)
    private String motP;

    public Employe(String idEmp, String nomEmp, String prenomEmp, String adresse, String motP) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.prenomEmp = prenomEmp;
        this.adresse = adresse;
        this.motP = motP;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getPrenomEmp() {
        return prenomEmp;
    }

    public void setPrenomEmp(String prenomEmp) {
        this.prenomEmp = prenomEmp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMotP() {
        return motP;
    }

    public void setMotP(String motP) {
        this.motP = motP;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "idEmp='" + idEmp + '\'' +
                ", nomEmp='" + nomEmp + '\'' +
                ", prenomEmp='" + prenomEmp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", motP='" + motP + '\'' +
                '}';
    }
}

