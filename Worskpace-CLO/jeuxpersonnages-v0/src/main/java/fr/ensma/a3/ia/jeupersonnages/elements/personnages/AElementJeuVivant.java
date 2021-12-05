/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.comportements.deplacement.IDeplacable;
import fr.ensma.a3.ia.jeupersonnages.comportements.deplacement.ResteImmobile;
import fr.ensma.a3.ia.jeupersonnages.comportements.troupe.ITroupable;
import fr.ensma.a3.ia.jeupersonnages.elements.AElementJeu;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

/**
 * @author carlos
 *
 */
public abstract class AElementJeuVivant extends AElementJeu implements IPersonnages, ITroupable{
	
	private Float niveauVie;
	protected Integer puissanceAtt;
	
	protected IDeplacable compoDeplacement;
	

	public AElementJeuVivant(Base labase, String identif, Float nv, Integer patt) {
		super(labase,identif);	
		niveauVie = Objects.requireNonNull(nv, "nv ne peut pas etre null");
		puissanceAtt = Objects.requireNonNull(patt, "patt ne peut pas etre null");
		getBase().ajoutPersoBase(this);
		
		compoDeplacement = new ResteImmobile();		
	}
	
	public AElementJeuVivant(Base labase, String identif, Float nv) {
		super(labase,identif);	
		niveauVie = Objects.requireNonNull(nv, "nv ne peut pas etre null");
		puissanceAtt = 0;
		getBase().ajoutPersoBase(this);
		
		compoDeplacement = new ResteImmobile();
	}
	
	@Override
	public final String getIdent() {
		return super.getIdent();
	}
	
	/**
	 * @return the niveauVie
	 */
	public Float getNiveauVie() {
		return niveauVie;
	}

	/**
	 * @param niveauVie the niveauVie to set
	 */
	public void setNiveauVie(Float niveauVie) {
		this.niveauVie = niveauVie;
	}
	
	public void setCompoDeplacement(IDeplacable comp){
		compoDeplacement = comp;
	}
	
	
	public void deplacement(IDeplacable p){
		compoDeplacement.deplacement(p);
	}
	
	@Override
	public String presenteToi(){
		return toString();
	}
	

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = super.hashCode();
		result = prime * result + Objects.hash(niveauVie, puissanceAtt);
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
		if (!(obj instanceof AElementJeuVivant)) {
			return false;
		}
		AElementJeuVivant other = (AElementJeuVivant) obj;
		return Objects.equals(niveauVie, other.niveauVie) && Objects.equals(puissanceAtt, other.puissanceAtt);
	}
	
	

	
}
