package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordonnance_source")
public class OrdonnanceSource extends BaseEntity{

    @Column(name = "nom_medecin")
    private String nomMedecin;
    @Column(name = "prenom_medecin")
    private String prenomMedecin;
    @Column(name = "nom_etablissement")
    private String nomEtablissement;
    private String etablissement;
    private String telephone;
    private String adresse;
    @Column(name = "date_creation")
    private Date dateCreation;

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getPrenomMedecin() {
        return prenomMedecin;
    }

    public void setPrenomMedecin(String prenomMedecin) {
        this.prenomMedecin = prenomMedecin;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<FichePrestation> getFiche() {
        return fiche;
    }

    public void setFiche(List<FichePrestation> fiche) {
        this.fiche = fiche;
    }

    @OneToMany(mappedBy = "ordonnance_source")
    private List<FichePrestation> fiche;


}
