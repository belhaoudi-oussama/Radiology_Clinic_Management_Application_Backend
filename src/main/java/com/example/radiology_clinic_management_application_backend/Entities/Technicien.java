package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "technicien")
public class Technicien extends Utilisateur{

    @OneToMany(mappedBy = "technicien")
    private List<TraitementTechnique> traitementsTechniques;
}
