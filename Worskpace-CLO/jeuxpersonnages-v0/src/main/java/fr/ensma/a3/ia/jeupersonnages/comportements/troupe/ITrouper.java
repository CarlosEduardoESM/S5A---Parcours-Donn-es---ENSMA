/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.comportements.troupe;

/**
 * @author carlos
 *
 */
public interface ITrouper {
	
	public void ajouterPerso(ITroupable p);
	public void supprimerPerso(ITroupable p)throws NotInTroupeException;

}
