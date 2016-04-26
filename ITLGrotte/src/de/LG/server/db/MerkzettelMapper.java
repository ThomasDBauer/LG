package de.LG.server.db;

import java.util.Vector;

import de.LG.shared.BO.Merkzettel;

public class MerkzettelMapper {
	
	// Ich bin cool
	private static MerkzettelMapper mzMapper = null;
	
	protected MerkzettelMapper(){
		
	}
	
	public MerkzettelMapper merkzettelMapper(){
		if(mzMapper == null){
			mzMapper = new MerkzettelMapper();
		}
		return mzMapper;
	}
	
	public void insertMerkzettel(Merkzettel mz){
		
	}
	
	public void updateMerkzettel (Merkzettel mz){
		
	}
	
	public void deleteMerkzettel (Merkzettel mz){
		
	}
	
	public Merkzettel getMerkzettelByProfil(int profilID){
		return null;
	}
	
	public Vector<Merkzettel> getMerkzettel(){
		return null;
	}
}
