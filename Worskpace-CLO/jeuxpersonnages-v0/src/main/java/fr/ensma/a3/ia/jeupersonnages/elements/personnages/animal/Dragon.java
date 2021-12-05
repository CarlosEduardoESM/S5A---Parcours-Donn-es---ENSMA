/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages.animal;

import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.Ouvrier;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public class Dragon extends APersonnageAnimal {
	
	public static int numInstance = 0;
	
	private static final Logger LOGGER = Logger.getLogger(Ouvrier.class.getName());

	/**
	 * @param labase
	 * @param identif
	 * @param nv
	 * @param patt
	 */
	public Dragon(Base labase, String identif, Float nv, Integer patt) {
		super(labase, identif, nv, patt);
		numInstance++;
	}
	
	/**
	 * @param labase
	 * @param nv
	 * @param patt
	 */
	public Dragon(Base labase, Float nv, Integer patt) {
		super(labase, "Dragon(" + (++numInstance) + ")", nv, patt);
	}

	
	
	

}
