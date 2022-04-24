package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rapport_technique")
public class RapportTechnique extends BaseEntity{

    private String titre;
    @Column(name = "date_de_creation")
    private LocalDateTime dateCreation;
    @OneToMany(mappedBy = "rapport_technique")
    private List<TraitementTechnique> traitementsTechniques;
    @OneToOne
    @JoinColumn(name = "fiche_prestation_id")
    private FichePrestation fichePrestation;
    @OneToOne(mappedBy = "rapport_technique")
    private Rapport rapport;

    public List<TraitementTechnique> getTraitementsTechniques() {
        return traitementsTechniques;
    }

    public void setTraitementsTechniques(List<TraitementTechnique> traitementsTechniques) {
        this.traitementsTechniques = traitementsTechniques;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public FichePrestation getFichePrestation() {
        return fichePrestation;
    }

    public void setFichePrestation(FichePrestation fichePrestation) {
        this.fichePrestation = fichePrestation;
    }

    public Rapport getRapport() {
        return rapport;
    }

    public void setRapport(Rapport rapport) {
        this.rapport = rapport;
    }

}
