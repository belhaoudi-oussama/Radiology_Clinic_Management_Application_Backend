package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient extends BaseEntity {

    private String cin;
    @ManyToOne
    @JoinColumn(name = "receptionniste_id")
    private Receptionniste createur;
    @OneToMany(mappedBy = "patient")
    private List<FichePrestation> fiches;
    @OneToMany(mappedBy = "patient")
    private List<Rendezvous> rendezvous;

    public List<FichePrestation> getFiches() {
        return fiches;
    }

    public void setFiches(List<FichePrestation> fiches) {
        this.fiches = fiches;
    }

    public List<Rendezvous> getRendezvous() {
        return rendezvous;
    }

    public void setRendezvous(List<Rendezvous> rendezvous) {
        this.rendezvous = rendezvous;
    }

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
