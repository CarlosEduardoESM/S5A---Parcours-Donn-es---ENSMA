/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.deplacement;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.AElementJeuVivant;

/**
 * @author carlos
 *
 */
public class EnCourant implements IDeplacable {
	
	private static final Logger LOGGER = Logger.getLogger(EnCourant.class.getName());
	
	@Override
	public void deplacement(IDeplacable p) {
		if (p instanceof AElementJeuVivant) {
			LOGGER.log(Level.INFO,((AElementJeuVivant)p).getIdent() + 
					" dit: " + "VITE !! Je me deplace en courant ...");
		}else {
			LOGGER.log(Level.INFO, "VITE !! en courant ...");
		}
	}

}
