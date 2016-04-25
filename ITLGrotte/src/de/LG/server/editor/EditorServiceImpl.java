package de.LG.server.editor;

import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.LG.shared.EditorService;
import de.LG.shared.BO.Eigenschaft;
import de.LG.shared.BO.Info;
import de.LG.shared.BO.Profil;
import de.LG.shared.BO.Suchprofil;

@SuppressWarnings("serial")
public class EditorServiceImpl extends RemoteServiceServlet implements EditorService{
	
	public String hello(String name){
		return "Hallo " + name;
	}
	
	//git Test
	
	public void profilErstellen(Profil p){
		
		//1. profilMapper.create(p);
		//2. merklistenMapper.create(p);
		//3. kontaktSperreMapper.create(p);
		//4. suchprofilMapper.create(p);
	}
	
	public void aehnlichkeitBerechnen(Profil referenz){
		//1. Profil[]profile = profilMapper.getProfile();
		//2. ausrechnen-Algorithmus
		// Aehnlichkeitsmasss aehnlichkeit = (was ausgerechnet wurde);
		//3. aehnlichkeitsMapper.insert(aehnlichkeit);
	}
	
	public void updateProfil(Profil p){
		//@ProfilMapper
		// UPDATE profile SET(allAttribute) VALUES(p.getAllAttribute()) WHERE id = 'p.getID()';
		//aehnlichkeitBerechnen(p);
	}
	
	public Vector<Eigenschaft> getAuswahlEigenschaften(){
		//@EigenschaftMapper.getAuswahlEigenschaften()
		//return SELECT * FROM eigenschaften OUTER JOIN auswahleigenschaften
		return null;
	}
	
	public Vector<Eigenschaft> getFreieEigenschaften(){
		//@EigenschaftenMapper.getFreieEigenschaften()
		//return SELECT * FROM eigenschaften (wir wollen nur die freien Eigenschaften)	
		return null;
	}
	
	public Vector<Info> getInfos(){
		//@InfoMapper
		//return SELECT * FROM infos  
		return null;
	}
	
	//@param GoogleID
	public void setInfoForProfile(Profil p, Info[]infos){
		//ProfilInfoMapper.updateAllInfos(p, infos);    //TODO array oder einzeln?
	}
	
	public Vector<Info> getInfoByProfil(Profil p){
		//profilInfoMapper.getInfoByProfil(p);
		return null;
	}
	
	public void updateSuchProfil(Suchprofil sp){
		//1. suchprofilMapper.updateSuchprofil(sp);
	}
	
}