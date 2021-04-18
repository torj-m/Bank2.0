package com.example.demo.Banque.domain;

import javax.persistence.*;

@Entity
@Table
public class Banque {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    protected String idB;
    @Column(nullable = false)
    protected String nomB;
    @Column(nullable = false)
    protected String adresse;

        public Banque(String idB, String nomB, String adresse) {
            this.idB = idB;
            this.nomB = nomB;
            this.adresse = adresse;
        }

        public String getIdB() {
            return idB;
        }

        public void setIdB(String idB) {
            this.idB = idB;
        }

        public String getNomB() {
            return nomB;
        }

        public void setNomB(String nomB) {
            this.nomB = nomB;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        @Override
        public String toString() {
            return "Banques{" +
                    "idB='" + idB + '\'' +
                    ", nomB='" + nomB + '\'' +
                    ", adresse='" + adresse + '\'' +
                    '}';
        }
    }
