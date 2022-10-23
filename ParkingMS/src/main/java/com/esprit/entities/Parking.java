package com.esprit.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Parking")
public class Parking implements Serializable {


	private static final long serialVersionUID = -1741519260556429015L;
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nom")
	private String nom;
	@Column(name="NombreDePlace")
	private double NombreDePlace;
	@Column(name="description")
	private String description;

	public Parking() {
		super();
	}

	public Parking(int id,String nom,double NombreDePlace,String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.NombreDePlace = NombreDePlace;
		this.description = description;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return NombreDePlace;
	}

	public void setPrix(double prix) {
		this.NombreDePlace = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
