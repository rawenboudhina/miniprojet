package com.rawen.restaurant.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity


public class Plat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idPlat;
	private String nomPLat;
	private double prixPLat;
	private Date dateCreation;
	
	@ManyToOne
	private Style style;
	public Style getStyle() {
		return style;
	}
	public void setStyle(Style style) {
		this.style = style;
	}
	public Long getIdPlat() {
		return idPlat;
	}
	public void setIdPlat(Long idPlat) {
		this.idPlat = idPlat;
	}
	public String getNomPLat() {
		return nomPLat;
	}
	public void setNomPLat(String nomPLat) {
		this.nomPLat = nomPLat;
	}
	public double getPrixPLat() {
		return prixPLat;
	}
	public void setPrixPLat(double prixPLat) {
		this.prixPLat = prixPLat;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Plat() {
		super();
	}
	public Plat(String nomPLat, double prixPLat, Date dateCreation) {
		super();
		this.nomPLat = nomPLat;
		this.prixPLat = prixPLat;
		this.dateCreation = dateCreation;
	}
	
	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", nomPLat=" + nomPLat + ", prixPLat=" + prixPLat + ", dateCreation="
				+ dateCreation + "]";
	}
	
	

}
