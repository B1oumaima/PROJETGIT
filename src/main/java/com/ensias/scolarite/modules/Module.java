package com.ensias.scolarite.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Module {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
//GeneratedValue, c’est pour dire à JPA d’adopter une stratégie de génération de la clé primaire parmi les quatre stratégies, à savoir : AUTO, IDENTITY, SEQUENCE et TABLE. Pour Derby, il vaut mieux utiliser la stratégie AUTO//
private int id;
private String nom;
private String description;
public Module() {
}
public Module(int id, String nom, String description) {
	super();
	this.id = id;
	this.nom = nom;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
