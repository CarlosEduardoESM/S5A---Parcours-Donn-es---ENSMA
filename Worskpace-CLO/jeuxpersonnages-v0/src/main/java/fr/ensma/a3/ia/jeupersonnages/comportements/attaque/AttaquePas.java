/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.attaque;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author carlos
 *
 */
public class AttaquePas implements IAttaqueTerre {

	private IAttaquantTerre attaquant;
	private static final Logger LOGGER = Logger.getLogger(ALaHache.class.getName());
	
	/**
	 * @param attaquant
	 */
	public AttaquePas(IAttaquantTerre attaquant) {
		this.attaquant = attaquant;
	}

	@Override
	public void aLAttaque(IAttaquableTerre cible) {
		LOGGER.log(Level.INFO,attaquant.getIdent() + " dit: Pffff ... J'attaque pas moua ... (sniff)");
	}

}
