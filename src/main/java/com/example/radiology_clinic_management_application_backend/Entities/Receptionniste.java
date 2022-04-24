package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "receptionniste")
@PrimaryKeyJoinColumn(name = "receptionniste_id")
public class Receptionniste extends Utilisateur{

    @OneToMany(mappedBy = "receptionniste")
    private List<Patient> ptients;

    @OneToMany(mappedBy = "receptionniste")
    private List<FichePrestation> fichePrestations;

    public List<FichePrestation> getFichePrestations() {
        return fichePrestations;
    }

    public void setFichePrestations(List<FichePrestation> fichePrestations) {
        this.fichePrestations = fichePrestations;
    }

    public List<Patient> getPtients() {
        return ptients;
    }

    public void setPtients(List<Patient> ptients) {
        this.ptients = ptients;
    }
}
