package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Eigenschaft;
import de.LG.shared.BO.EigenschaftAuswahl;

public class EigenschaftMapper {
	
	private static EigenschaftMapper eMapper = null;
	
	protected EigenschaftMapper(){
		
	}
	
	public EigenschaftMapper eigenschaftMapper(){
		if(eMapper == null){
			eMapper = new EigenschaftMapper();
		}
		return eMapper;
	}
	
	public void insertEigenschaft(Eigenschaft e){
		
	}
	
	public void updateEigenschaft(Eigenschaft e){
		
	}
	
	public void deleteEigenschaft(Eigenschaft e){
		
	}
	
	public Eigenschaft getEigenschaftByID(int id){
		return null;
	}
	
	public Vector<Eigenschaft> getEigenschaft(){
		return null;
	}
	
}
