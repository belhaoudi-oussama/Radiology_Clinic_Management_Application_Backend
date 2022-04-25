package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "traitement_technique")
public class TraitementTechnique extends BaseEntity{

    @Lob
    @Column(name = "description_technique")
    private String descriptionTechnique;
    @Lob
    private String diagnostique;
    @ManyToOne
    @JoinColumn(name = "technicien")
    private Technicien technicien;
    @ManyToOne
    @JoinColumn(name = "rapport_technique")
    private RapportTechnique rapportTechnique;
    @OneToMany(mappedBy = "traitementTechnique")
    private List<ImageRadiographique> imagesRadiographique;

    public String getDescriptionTechnique() {
        return descriptionTechnique;
    }

    public void setDescriptionTechnique(String descriptionTechnique) {
        this.descriptionTechnique = descriptionTechnique;
    }

    public String getDiagnostique() {
        return diagnostique;
    }

    public void setDiagnostique(String diagnostique) {
        this.diagnostique = diagnostique;
    }

    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    public RapportTechnique getRapportTechnique() {
        return rapportTechnique;
    }

    public void setRapportTechnique(RapportTechnique rapportTechnique) {
        this.rapportTechnique = rapportTechnique;
    }

    public List<ImageRadiographique> getImagesRadiographique() {
        return imagesRadiographique;
    }

    public void setImagesRadiographique(List<ImageRadiographique> imagesRadiographique) {
        this.imagesRadiographique = imagesRadiographique;
    }
}
