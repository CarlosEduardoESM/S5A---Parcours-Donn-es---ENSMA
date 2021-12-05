/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.comportements.attaque.IAttaquableTerre;
import fr.ensma.a3.ia.jeupersonnages.comportements.attaque.IAttaquantTerre;
import fr.ensma.a3.ia.jeupersonnages.comportements.attaque.IAttaqueTerre;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public class Guerrier extends APersonnageHumain implements IAttaquantTerre{
	
	private static int numInstance = 0;
	
	IAttaqueTerre compoAttaque;
	
	private static final Logger LOGGER = Logger.getLogger(Ouvrier.class.getName());
	
	public Guerrier(Base labase, String identif, Float nv, final Integer patt) {
		super(labase, identif, nv, patt);
		numInstance++;
	}
	
	public Guerrier(Base labase, Float nv, final Integer patt) {
		super(labase, "Guerrier(" + (++numInstance) + ")", nv, patt);
	}
	
	@Override
	public final Integer getPuissanceAtt() {
		return puissanceAtt;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - PAtt = " + puissanceAtt;
	}

	@Override
	public void estAttaque(Integer puissatt) {
		setNiveauVie(getNiveauVie() - puissatt/100.0f);
		LOGGER.log(Level.INFO, getIdent() + "dit : Aiieeee ça fait mal !! (nvie -> " + getNiveauVie() + ")");		
	}

	@Override
	public void aLAttaque(IAttaquableTerre cible) {
		compoAttaque.aLAttaque(cible);
		
	}

}
