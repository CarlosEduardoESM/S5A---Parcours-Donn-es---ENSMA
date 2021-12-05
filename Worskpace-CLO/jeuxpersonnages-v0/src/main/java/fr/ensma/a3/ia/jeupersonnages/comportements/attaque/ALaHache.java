/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.attaque;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.Ouvrier;

/**
 * @author carlos
 *
 */
public class ALaHache implements IAttaqueTerre {
	
	private IAttaquantTerre attaquant;
	private static final Logger LOGGER = Logger.getLogger(ALaHache.class.getName());
	
	

	/**
	 * @param attaquant
	 */
	public ALaHache(IAttaquantTerre attaquant) {
		this.attaquant = attaquant;
	}

	@Override
	public void aLAttaque(IAttaquableTerre cible) {
		LOGGER.log(Level.INFO,attaquant.getIdent() + " dit: Ah Ah Ah " +cible.getIdent() + 
				", je vais te trancher en deux avec ma Hache !!!" + "(" + attaquant.getPuissanceAtt() * 2 + ")");
		cible.estAttaque(attaquant.getPuissanceAtt() * 2);
	}

}
