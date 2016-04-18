package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Suchprofil;

public class SuchprofilMapper {

	
	private static SuchprofilMapper spMapper = null;
	
	protected SuchprofilMapper(){
		
	}
	
	public SuchprofilMapper suchprofilMapper(){
		if(spMapper == null){
			spMapper = new SuchprofilMapper();
		}
		return spMapper;
	}
	
	
	public void insertSuchprofil (Suchprofil sp){
		
	}
	
	public void updateSuchprofil (Suchprofil sp){
		
	}
	
	public void deleteSuchprofil (Suchprofil sp){
		
	}
	
	public Suchprofil getSuchprofil(int profilID){
		return null;
	}
	
	public Vector<Suchprofil> getSuchprofile(){
		return null;
	}

}
