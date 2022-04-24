package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "medecin")
@PrimaryKeyJoinColumn(name = "medecin_id")
public class Medecin extends Utilisateur{

    @OneToMany(mappedBy = "medecin")
    private List<Rapport> rapports;

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }
}
