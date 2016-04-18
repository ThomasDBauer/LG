package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Aehnlichkeitsmass;
import de.LG.shared.BO.Profil;

public class AehnlichkeitMapper {
	
	private static AehnlichkeitMapper aelkMapper = null;
	
	protected AehnlichkeitMapper(){
		
	}
	
	public AehnlichkeitMapper aehnlichkeitMapper(){
		if(aelkMapper == null){
			aelkMapper = new AehnlichkeitMapper();
		}
		return aelkMapper;
	}
	
	public void insertAehnlichkeit(Profil ref, Profil vgl, byte value){
		
	}
	
	public void deleteAehnlichkeit (Profil ref, Profil vgl){
		
	}
	
	public void updateAehnlichkeit (Profil ref){
		
	}
	
	public Vector<Aehnlichkeitsmass> getAehnlichkeit(){
		return null;
	}
	
	public Vector<Aehnlichkeitsmass> getAehnlichkeitByProfil(Profil p){
		return null;
	}
	
}
