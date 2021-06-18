package model;

import java.util.Arrays;

public class Personne implements Affichage, Consultation {
	private int num;
	private String nom;
	private String prenom;
	private Adresse[] adresses;

	
	public Personne() {
	}	
	
	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num >= 0) {
			this.num = num;
		} else {
			this.num = 0;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherNomMajuscule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherPrenomMajuscule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}

	
}
