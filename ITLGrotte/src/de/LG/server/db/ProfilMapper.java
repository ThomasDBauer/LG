package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Profil;
import de.LG.shared.BO.Suchprofil;

public class ProfilMapper {
	
	private static ProfilMapper profilMapper = null;
	
	protected ProfilMapper(){
		
	}
	
	public ProfilMapper profilMapper(){
		if(profilMapper == null){
			profilMapper = new ProfilMapper();
		}
		return profilMapper;
	}
	
	//@param googleID
	public Profil getProfilByGoogleID(){
		return null;
	}
	
	public Vector<Profil> getBySuchprofil(Suchprofil sp){
		//select profil.eigenschaften WHERE values = sp
		return null;
	}
	
	public Vector<Profil> getAll(){
		return null;
	}
	
	public void deleteProfil(Profil p){
		//delete p
	}
	
	public void updateProfil(Profil p){
		
	}
	
	public void inserProfil(Profil p){
		
	}
}


