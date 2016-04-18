package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.ProfilInfo;

public class ProfilInfoMapper {

	private static ProfilInfoMapper piMapper = null;
	
	protected ProfilInfoMapper(){
		
	}
	
	public ProfilInfoMapper profilInfoMapper(){
		if(piMapper == null){
			piMapper = new ProfilInfoMapper();
		}
		return piMapper;
	}
	
	
	public void insertProfilInfo(ProfilInfo pi){
		
	}
	
	public void updateProfilInfo (ProfilInfo pi){
		
	}
	
	public void deleteProfilInfo (ProfilInfo pi){
		
	}
	
	public ProfilInfo getProfilInfo(int profilID){
		return null;
	}
	
	public Vector<ProfilInfo> getProfilInfos(){
		return null;
	}
}
