package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rendezvous extends BaseEntity{

    @Column(name = "date-de-rendezvous")
    private Date dateDeRendezvous;
    @Column(name = "date-de-creation")
    private Date dateDeCreation;
    @Lob
    private String description;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "receptionniste_id")
    private Receptionniste receptionniste;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDeRendezvous() {
        return dateDeRendezvous;
    }

    public void setDateDeRendezvous(Date dateDeRendezvous) {
        this.dateDeRendezvous = dateDeRendezvous;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Receptionniste getReceptionniste() {
        return receptionniste;
    }

    public void setReceptionniste(Receptionniste receptionniste) {
        this.receptionniste = receptionniste;
    }
}
