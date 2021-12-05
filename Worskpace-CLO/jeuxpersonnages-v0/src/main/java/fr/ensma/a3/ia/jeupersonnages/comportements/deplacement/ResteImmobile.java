/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.deplacement;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author carlos
 *
 */
public class ResteImmobile implements IDeplacable {
	
	private static final Logger LOGGER = Logger.getLogger(ResteImmobile.class.getName());

	@Override
	public void deplacement(IDeplacable p) {
		LOGGER.log(Level.WARNING,"Deplacement impossible");
		throw new AucunDeplacementException(); 

	}

}
