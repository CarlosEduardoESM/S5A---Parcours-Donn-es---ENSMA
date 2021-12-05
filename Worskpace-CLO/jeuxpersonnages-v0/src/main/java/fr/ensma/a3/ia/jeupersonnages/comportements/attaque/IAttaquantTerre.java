/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.attaque;

/**
 * @author carlos
 *
 */
public interface IAttaquantTerre {
	
	public String getIdent();
	public Integer getPuissanceAtt();
	public void aLAttaque(IAttaquableTerre cible);
	
}
