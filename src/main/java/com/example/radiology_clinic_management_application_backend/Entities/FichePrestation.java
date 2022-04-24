package com.example.radiology_clinic_management_application_backend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "fiche_prestation")
public class FichePrestation extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "ordonnance_source_id")
    private OrdonnanceSource source;
    @ManyToOne
    @JoinColumn(name = "receptionniste_id")
    private Receptionniste receptionniste;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @OneToOne(mappedBy = "fich_Prestation")
    private RapportTechnique rapportTech;

    public OrdonnanceSource getSource() {
        return source;
    }

    public void setSource(OrdonnanceSource source) {
        this.source = source;
    }

    public Receptionniste getReceptionniste() {
        return receptionniste;
    }

    public void setReceptionniste(Receptionniste receptionniste) {
        this.receptionniste = receptionniste;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public RapportTechnique getRapportTech() {
        return rapportTech;
    }

    public void setRapportTech(RapportTechnique rapportTech) {
        this.rapportTech = rapportTech;
    }

}
