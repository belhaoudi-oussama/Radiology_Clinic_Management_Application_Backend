package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image_radiographique")
public class ImageRadiographique extends BaseEntity{

    private String imagePath;
    @ManyToOne
    @JoinColumn(name = "categorie_image")
    private CategorieImage categorieImage;
    @ManyToOne
    @JoinColumn(name = "traitement_technique_id")
    private TraitementTechnique traitementTechnique;

    public TraitementTechnique getTraitementTechnique() {
        return traitementTechnique;
    }

    public void setTraitementTechnique(TraitementTechnique traitementTechnique) {
        this.traitementTechnique = traitementTechnique;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public CategorieImage getCategorieImage() {
        return categorieImage;
    }

    public void setCategorieImage(CategorieImage categorieImage) {
        this.categorieImage = categorieImage;
    }
}
