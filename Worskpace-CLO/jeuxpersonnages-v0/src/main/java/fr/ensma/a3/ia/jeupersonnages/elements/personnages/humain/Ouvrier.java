/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public class Ouvrier extends APersonnageHumain {
	
	private static int numInstance = 0;
	private Integer puissanceTrav;
	
	private static final Logger LOGGER = Logger.getLogger(Ouvrier.class.getName());
	
	
	/**
	 * @param labase
	 * @param identif
	 * @param nv
	 */
	public Ouvrier(Base labase, String identif, Float nv, final Integer ptr) {
		super(labase, identif, nv);
		puissanceTrav = Objects.requireNonNull(ptr, "ptr ne peut pas etre null");
		numInstance++;
	}
	
	public Ouvrier(Base labase, Float nv, final Integer ptr) {
		super(labase, "Ouvrier(" + (++numInstance) + ")", nv);
		puissanceTrav = Objects.requireNonNull(ptr, "ptr ne peut pas etre null");
	}
	
	@Override
	public void estAttaque(Integer puissatt) {
		setNiveauVie(getNiveauVie() - puissatt/50.0f);
		LOGGER.log(Level.INFO, getIdent() + "dit : Aiieeee ça fait mal !! (nvie -> " + getNiveauVie() + ")");		
	}
	
	
	/**
	 * @return the puissanceTrav
	 */
	public final Integer getPuissanceTrav() {
		return puissanceTrav;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - PTr = " + puissanceTrav;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = super.hashCode();
		result = prime * result + Objects.hash(puissanceTrav);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Ouvrier)) {
			return false;
		}
		Ouvrier other = (Ouvrier) obj;
		return Objects.equals(puissanceTrav, other.puissanceTrav);
	}
	
	



	

}
