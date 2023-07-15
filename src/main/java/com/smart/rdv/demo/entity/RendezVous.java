package com.smart.rdv.demo.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class RendezVous implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  Idrdv;
    @Column(name = "jour", nullable = false)
    @Temporal(TemporalType.DATE)
    private String jour;

	private String descriptif;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private User user;

    
    public Long getIdrdv() {
        return Idrdv;
    }
    public String getJour() {
        return jour;
    }
    public String getDescriptif() {
        return descriptif;
    }

    
    public void setIdrdv(Long idrdv) {
        Idrdv = idrdv;
    }
    public void setJour(String jour) {
        this.jour = jour;
    }
    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
    public RendezVous(Long idrdv, String  jour, String descriptif) {
        Idrdv = idrdv;
        this.jour = jour;
        this.descriptif = descriptif;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public RendezVous() {
    }
   
    
	



}
