package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Kontaktsperre;


public class KontaktsperreMapper {

	private static KontaktsperreMapper ksMapper = null;
	
	protected KontaktsperreMapper(){
		
	}
	
	public KontaktsperreMapper kontaktsperreMapper(){
		if(ksMapper == null){
			ksMapper = new KontaktsperreMapper();
		}
		return ksMapper;
	}
	
	public void insertKontaktsperre(Kontaktsperre ks){
		
	}
	
	public void updateKontaktsperre (Kontaktsperre ks){
		
	}
	
	public void deleteKontaktsperre (Kontaktsperre ks){
		
	}
	
	public Kontaktsperre getKontaktsperreByProfil(int profilID){
		return null;
	}
	
	public Vector<Kontaktsperre> getKontaktsperren(){
		return null;
	}
}
