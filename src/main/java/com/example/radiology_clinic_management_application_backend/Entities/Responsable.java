package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "responsable")
@PrimaryKeyJoinColumn(name = "responsable_id")
public class Responsable extends Utilisateur{

    @OneToMany(mappedBy = "responsable")
    private List<Utilisateur> utilisateur;

    public List<Utilisateur> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateur> utilisateur) {
        this.utilisateur = utilisateur;
    }
}
