package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "facture")
public class Facture extends BaseEntity{

    private Date dateCreation;
    @OneToOne
    @JoinColumn(name = "fiche_prestation_id")
    private FichePrestation fichePrestation;

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public FichePrestation getFichePrestation() {
        return fichePrestation;
    }

    public void setFichePrestation(FichePrestation fichePrestation) {
        this.fichePrestation = fichePrestation;
    }
}
