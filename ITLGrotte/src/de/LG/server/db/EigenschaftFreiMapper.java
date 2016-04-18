package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.EigenschaftAuswahl;
import de.LG.shared.BO.EigenschaftFrei;

public class EigenschaftFreiMapper {
	
	
	private static EigenschaftFreiMapper eFreiMapper = null;
	
	protected EigenschaftFreiMapper(){
		
	}
	
	public EigenschaftFreiMapper eigenschaftFreiMapper(){
		if(eFreiMapper == null){
			eFreiMapper = new EigenschaftFreiMapper();
		}
		return eFreiMapper;
	}
	
	
	public void insertEigenschaftFrei(EigenschaftFrei e){
		
	}
	
	public void deleteEigenschaftFrei(EigenschaftFrei e){
		
	}
	
	public void updateEigenschaftFrei(EigenschaftFrei e){
		
	}
	
	public EigenschaftFrei getEigenschaftFreiByID(int id){
		return null;
	}
	
	public Vector<EigenschaftFrei> getEigenschaftFrei(){
		return null;
	}
	
	
}
