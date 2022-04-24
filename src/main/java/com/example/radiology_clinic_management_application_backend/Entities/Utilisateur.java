package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur extends Personne{

    @Column(name = "mot_de_passe")
    private String motDePasse;
    @ManyToOne
    @JoinColumn(name = "createur")
    private Responsable createur;

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Responsable getCreateur() {
        return createur;
    }

    public void setCreateur(Responsable createur) {
        this.createur = createur;
    }
}
