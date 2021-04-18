package com.example.demo.Banque.domain;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private String IdTr;
    @Column(nullable = false)
    private String type;
    @Column
    private Date date;
    @Column
    private float  H_DebutT;

    public Transaction(String idTr, String type, Date date, float h_DebutT) {
        IdTr = idTr;
        this.type = type;
        this.date = date;
        H_DebutT = h_DebutT;
    }

    public String getIdTr() {
        return IdTr;
    }

    public void setIdTr(String idTr) {
        IdTr = idTr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getH_DebutT() {
        return H_DebutT;
    }

    public void setH_DebutT(float h_DebutT) {
        H_DebutT = h_DebutT;
    }
}
