package de.LG.server.db;

import java.util.Vector;
import de.LG.shared.BO.Info;

public class InfoMapper {

	
	private static InfoMapper infoMapper = null;
	
	protected InfoMapper(){
		
	}
	
	public InfoMapper infoMapper(){
		if(infoMapper == null){
			infoMapper = new InfoMapper();
		}
		return infoMapper;
	}
	
	public void insertInfo(Info info){
		
	}
	
	public void updateInfo(Info info){
		
	}
	
	public void deleteInfo(int id){
		
	}
	
	public Info getInfoByID(int id){
		return null;
	}
	
	public Vector<Info> getInfos(){
		return null;
	}
}
