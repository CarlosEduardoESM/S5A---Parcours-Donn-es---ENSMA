package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public enum ECouleur {
	
	Rouge("Lannister"), Vert("Tyrell"), Bleu("Stark"), Jaune("Baratheon");
	
	private String nomFamille;
	
	private ECouleur(final String val) {
		nomFamille = val;
	}
	
	
	public String getNom() {
		return nomFamille;
	}
	
	
	public static ECouleur getCouleurByFamille(final String nom) {
		Objects.requireNonNull(nom, "nom ne peut pas etre null ...");
		List<ECouleur> all_coul = Arrays.asList(ECouleur.values());
		ListIterator<ECouleur> ite = all_coul.listIterator();
		while (ite.hasNext()) {
			ECouleur coul = ite.next();
			
			if (coul.getNom().compareTo(nom) == 0) {
				return coul;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + nomFamille + ")";
 	}

}
