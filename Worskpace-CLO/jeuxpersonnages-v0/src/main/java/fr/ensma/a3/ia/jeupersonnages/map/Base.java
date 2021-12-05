/**
 * 
 */
package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.objets.IObjets;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.IPersonnages;

/**
 * @author carlos
 *
 */
public class Base {
	
	private String nomBase;
	private ECouleur coulBase;
	private List<IPersonnages> mesPersos;
	private List<IObjets> mesObjets;
	
	public Base(String nomBase, ECouleur coulBase) {
		
		this.nomBase = Objects.requireNonNull(nomBase,"nomBase ne peut pas etre null ...");
		this.coulBase = Objects.requireNonNull(coulBase,"coulBase ne peut pas etre null ...");
		mesPersos = new ArrayList<IPersonnages>();
		mesObjets = new ArrayList<IObjets>();
	}

	public final String getNomBase() {
		return nomBase;
	}

	public final ECouleur getCoulBase() {
		return coulBase;
	}
	
	public final int getNbPersonnages() {
		return mesPersos.size();
	}
	
	public final int getNbObjets() {
		return mesObjets.size();
	}
	
	public final void ajoutPersoBase(final IPersonnages pers) {
		mesPersos.add(pers);
	}
	
	public final void ajoutObjetBase(final IObjets obj) {
		mesObjets.add(obj);
	}
	
	
	public final boolean supprPersoBase(IPersonnages pers) throws BaseVideException {
		if (getNbPersonnages() == 0) {
			throw new BaseVideException("Aucune personnage dans la base");
		}
		return mesPersos.remove(pers);
	}
	
	public final boolean supprObjetBase(IObjets obj) throws BaseVideException {
		if (getNbObjets()== 0) {
			throw new BaseVideException("Aucune objet dans la base");
		}
		return mesObjets.remove(obj);
	}
	
	public final void Alarme() {
		for (IPersonnages p : mesPersos) {
			//p.Alarme();
		}
		for (IObjets o : mesObjets) {
			//o.Alarme();
		}
	}
	
	@Override
	public String toString() {
		StringBuffer rep = new StringBuffer(nomBase + " - " + coulBase + "\n");
		rep.append("-----------------\n");
		rep.append("Personnages: \n");
		for (IPersonnages p: mesPersos) {
			rep.append(p);
			rep.append("\n");
		}
		rep.append("-----------------\n");
		rep.append("Objets: \n");
		for (IObjets o: mesObjets) {
			rep.append(o);
			rep.append("\n");
		}
		rep.append("-----------------\n");
		return rep.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Base)) {
			return false;
		}
		
		Base bse = (Base) obj;
		
		return (coulBase == bse.coulBase && 
				(bse.getNomBase().compareTo(nomBase) == 0) 
				&& (bse.getNbPersonnages() == 0)
				&& (bse.getNbObjets() == 0));
	}
	
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * HASH_MULT_PRIME + nomBase.hashCode();
		hash = hash * HASH_MULT_PRIME + coulBase.hashCode();
		hash = hash * HASH_MULT_PRIME + mesPersos.hashCode();
		hash = hash * HASH_MULT_PRIME + mesObjets.hashCode();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 5;
	
	
	
	

}
