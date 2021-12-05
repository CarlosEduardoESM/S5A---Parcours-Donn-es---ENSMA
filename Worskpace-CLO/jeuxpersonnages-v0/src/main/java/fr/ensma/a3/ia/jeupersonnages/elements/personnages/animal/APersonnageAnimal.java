/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages.animal;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.AElementJeuVivant;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.APersonnageHumain;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public abstract class APersonnageAnimal extends AElementJeuVivant {
	
	private static final Logger LOGGER = Logger.getLogger(APersonnageAnimal.class.getName());
	
	public APersonnageAnimal(Base labase, String identif, Float nv, Integer patt) {
		super(labase, identif, nv, patt);
		
	}
	
	public APersonnageAnimal(Base labase, String identif, Float nv) {
		super(labase, identif, nv);
	}
	
	@Override
	public void alarme() {
		LOGGER.log(Level.INFO, "Vite, rentrons !!!");
	}

}
