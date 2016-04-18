package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.EigenschaftAuswahl;

public class EigenschaftAuswahlMapper {

	
	private static EigenschaftAuswahlMapper eAuswahlMapper = null;
	
	protected EigenschaftAuswahlMapper(){
		
	}
	
	public EigenschaftAuswahlMapper eigenschaftAuswahlMapper(){
		if(eAuswahlMapper == null){
			eAuswahlMapper = new EigenschaftAuswahlMapper();
		}
		return eAuswahlMapper;
	}
	
	public void insertEigenschaftAuswahl(EigenschaftAuswahl ea){
		
	}
	
	public void updateEigenschaftAuswahl(EigenschaftAuswahl ea){
		
	}
	
	public void deleteEigenschaftAuswahl(EigenschaftAuswahl ea){
		
	}
	
	public EigenschaftAuswahl getEigenschaftAuswahlByID(int id){
		return null;
	}
	
	public Vector<EigenschaftAuswahl> getEigenschaftAuswahl(){
		return null;
	}
	
	
}
