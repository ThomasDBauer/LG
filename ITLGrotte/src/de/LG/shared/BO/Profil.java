package de.LG.shared.BO;

import java.util.Date;

public class Profil extends BusinessObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String fname, lname, haarfarbe, religion;
	private int alter, koerpergroesse;
	private Date geburtsdatum;
	private boolean raucher;
	private Info[] profilInformation;
	private Merkzettel merkzettel;
	private Kontaktsperre[] sperrliste;
	private Aehnlichkeitsmass[] aehnlichkeitsmass;
	private Suchprofil suchprofil;
	
	
	
	public Merkzettel getMerkzettel() {
		return merkzettel;
	}
	public void setMerkzettel(Merkzettel merkzettel) {
		this.merkzettel = merkzettel;
	}
	public Kontaktsperre[] getSperrliste() {
		return sperrliste;
	}
	public void setSperrliste(Kontaktsperre[] sperrliste) {
		this.sperrliste = sperrliste;
	}
	public Aehnlichkeitsmass[] getAehnlichkeitsmasse() {
		return aehnlichkeitsmass;
	}
	public void setAehnlichkeitsmasse(Aehnlichkeitsmass[] aehnlichkeitsmasse) {
		this.aehnlichkeitsmass = aehnlichkeitsmasse;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public int getKoerpergroesse() {
		return koerpergroesse;
	}
	public void setKoerpergroesse(int koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public boolean isRaucher() {
		return raucher;
	}
	public void setRaucher(boolean raucher) {
		this.raucher = raucher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Info[] getProfilInformation() {
		return profilInformation;
	}
	public void setProfilInformation(Info[] profilInformation) {
		this.profilInformation = profilInformation;
	}
	public Aehnlichkeitsmass[] getAehnlichkeitsmass() {
		return aehnlichkeitsmass;
	}
	public void setAehnlichkeitsmass(Aehnlichkeitsmass[] aehnlichkeitsmass) {
		this.aehnlichkeitsmass = aehnlichkeitsmass;
	}
	public Suchprofil getSuchprofil() {
		return suchprofil;
	}
	public void setSuchprofil(Suchprofil suchprofil) {
		this.suchprofil = suchprofil;
	}
	
	
}
