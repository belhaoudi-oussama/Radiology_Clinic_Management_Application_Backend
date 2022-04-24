package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rapport")
public class Rapport extends BaseEntity{

    private String titre;
    @Column(name = "date_de_creation")
    private Date dateCreation;
    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecin;
    @OneToOne
    @JoinColumn(name = "rapport_technique")
    private RapportTechnique rapportTechnique;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public RapportTechnique getRapportTechnique() {
        return rapportTechnique;
    }

    public void setRapportTechnique(RapportTechnique rapportTechnique) {
        this.rapportTechnique = rapportTechnique;
    }
}
