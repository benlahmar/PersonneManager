/**
 * 
 */
package com.pers.ma.model;

import javax.persistence.Embeddable;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Embeddable
public class Adresse {

	/**
	 * @param rue
	 * @param ville
	 * @param pays
	 */
	public Adresse(String rue, String ville, String pays) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}
	/**
	 * 
	 */
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	String rue;
	String ville,pays;
	
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
