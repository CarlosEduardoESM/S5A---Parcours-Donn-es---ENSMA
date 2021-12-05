/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.comportements.attaque.IAttaquableTerre;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.AElementJeuVivant;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public abstract class APersonnageHumain extends AElementJeuVivant implements IAttaquableTerre{

	private static final Logger LOGGER = Logger.getLogger(APersonnageHumain.class.getName());
	
	public APersonnageHumain(Base labase, String identif, Float nv, Integer patt) {
		super(labase, identif, nv, patt);
	}
	
	public APersonnageHumain(Base labase, String identif, Float nv) {
		super(labase, identif, nv);
	}
	
	@Override
	public void alarme() {
		LOGGER.log(Level.INFO, "Vite, rentrons !!!");
	}
	
	@Override
	public String toString() {
		return "Humain(" + getBase().getNomBase() + ") -> " + getIdent() + " - NV= " + getNiveauVie();
	}
	
	

}
