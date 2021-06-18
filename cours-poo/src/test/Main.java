package test;

import java.util.Iterator;

import model.Adresse;
import model.Enseignant;
import model.Etudiant;
import model.Personne;

public class Main {

	public static void main(String[] args) {
		Personne personne = new Personne(200, "wick", "john");
//		personne.setNom("wick");
//		personne.setPrenom("john");
//		personne.setNum(100);
		
		//System.out.println(personne);
		
		Adresse adresse = new Adresse();
		adresse.setRue("rue Aristide Briand");
		adresse.setCodePostal("92130");
		adresse.setVille("Issy");
		//System.out.println(adresse);
		
		Adresse adresse2 = new Adresse("rue de paris", "75015", "Paris");
		
		Adresse [] adresses = new Adresse[] {adresse, adresse2};
		Personne personne2 = new Personne(1, "Jean", "Gabin",adresses );
		//System.out.println(personne2);
		
//		for (int i = 0; i < adresses.length; i++) {
//			System.out.println(adresses[i]);
//		}
//		
//		for (Adresse adresse3 : adresses) {
//			System.out.println(adresse3.getVille());
//		}
		
		Etudiant etudiant =  new Etudiant(400, "Cervera", "Sophie", adresses, "master");
		System.out.println(etudiant);
		
		Enseignant enseignant = new Enseignant(1, "El mouelhi", "Achref", adresses, 3600);
		System.out.println(enseignant);
		
		System.out.println(enseignant instanceof Personne);
		System.out.println(personne instanceof Enseignant);
		
		Personne[] personnes = new Personne[] {etudiant, personne, enseignant};
		
		for (Personne person : personnes) {
			if (person instanceof Enseignant) {
				System.out.println(((Enseignant) person).getSalaire());
			} else if (person instanceof Etudiant) {
				System.out.println(((Etudiant) person).getNiveau());
			} else {
				System.out.println(person.getNum());
			}
		}
	}

}

