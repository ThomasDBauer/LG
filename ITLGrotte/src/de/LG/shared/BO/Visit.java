package de.LG.shared.BO;

public class Visit extends BusinessObject{
	
	private static final long serialVersionUID = 1L;
	
	private Profil gast;
	private Profil gastgeber;
	
	public Profil getGast() {
		return gast;
	}
	public void setGast(Profil gast) {
		this.gast = gast;
	}
	public Profil getGastgeber() {
		return gastgeber;
	}
	public void setGastgeber(Profil gastgeber) {
		this.gastgeber = gastgeber;
	}
	
	
	
}
