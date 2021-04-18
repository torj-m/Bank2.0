package com.example.demo.Banque.domain;

import javax.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private String idClt;
    @Column(nullable = false)
    private String nomClt;
    @Column(nullable = false)
    private String prenomClt;
    @Column
    private int tel;
    @Column
    private String email;
    @Column(nullable = false)
    private String motP;
    @Column
    private String adresse;
    @Column(nullable = false)
    private int cin;

    public Client( String nomClt, String prenomClt, int tel, String email, String motP, String adresse, int cin) {

        this.nomClt = nomClt;
        this.prenomClt = prenomClt;
        this.tel = tel;
        this.email = email;
        this.motP = motP;
        this.adresse = adresse;
        this.cin = cin;
    }

    public String getIdClt() {
        return idClt;
    }

    public void setIdClt(String idClt) {
        this.idClt = idClt;
    }

    public String getNomClt() {
        return nomClt;
    }

    public void setNomClt(String nomClt) {
        this.nomClt = nomClt;
    }

    public String getPrenomClt() {
        return prenomClt;
    }

    public void setPrenomClt(String prenomClt) {
        this.prenomClt = prenomClt;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotP() {
        return motP;
    }

    public void setMotP(String motP) {
        this.motP = motP;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClt='" + idClt + '\'' +
                ", nomClt='" + nomClt + '\'' +
                ", prenomClt='" + prenomClt + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                ", motP='" + motP + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cin=" + cin +
                '}';
    }
}
