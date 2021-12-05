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
public class AuCouteau implements IAttaqueTerre {

	private IAttaquantTerre attaquant;
	private static final Logger LOGGER = Logger.getLogger(ALaHache.class.getName());
	
	

	/**
	 * @param attaquant
	 */
	public AuCouteau(IAttaquantTerre attaquant) {
		this.attaquant = attaquant;
	}

	@Override
	public void aLAttaque(IAttaquableTerre cible) {
		LOGGER.log(Level.INFO,attaquant.getIdent() + " dit: Ah Ah Ah " +cible.getIdent() + 
				", je vais t'occir avec mon coutelas !!!" + "(" + attaquant.getPuissanceAtt()+ ")");
		cible.estAttaque(attaquant.getPuissanceAtt());
	}

}
