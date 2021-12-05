/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public abstract class AElementJeu {
	
	private Base maBase;
	private String ident;
	
	public AElementJeu(final Base labase, final String identif) {
		maBase = Objects.requireNonNull(labase, "labase ne peut pas etre null");
		ident = Objects.requireNonNull(identif, "identf ne peut pas etre null");
	}
	

	public final Base getBase() {
		return maBase;
	}
	
	public String getIdent() {
		return ident;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}	
		if (this == obj) {
			return true;	
		}
		if (!(obj instanceof AElementJeu)) {
			return false;
		}
		AElementJeu elj = (AElementJeu) obj;
		return maBase.equals(elj.maBase);
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * HASH_MULT_PRIME + maBase.hashCode();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 13;
	

}
