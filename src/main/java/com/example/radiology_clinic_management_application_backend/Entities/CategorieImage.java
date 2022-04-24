package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorie_image")
public class CategorieImage extends BaseEntity{

    private String libeller;
    private String Type;
    private float tarif;

    public String getLibeller() {
        return libeller;
    }

    public void setLibeller(String libeller) {
        this.libeller = libeller;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
