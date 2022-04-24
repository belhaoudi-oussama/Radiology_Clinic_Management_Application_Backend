package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient extends BaseEntity {

    private String cin;
    @ManyToOne
    @JoinColumn(name = "receptionniste_id")
    private Receptionniste createur;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Receptionniste getCreateur() {
        return createur;
    }

    public void setCreateur(Receptionniste createur) {
        this.createur = createur;
    }
}
