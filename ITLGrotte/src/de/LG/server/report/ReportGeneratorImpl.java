package de.LG.server.report;

import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.LG.shared.ReportGeneratorService;
import de.LG.shared.BO.Kontaktsperre;
import de.LG.shared.BO.Merkzettel;
import de.LG.shared.BO.Profil;
import de.LG.shared.BO.Suchprofil;

@SuppressWarnings("serial")
public class ReportGeneratorImpl extends RemoteServiceServlet implements ReportGeneratorService {
	
	
	//Profil
	
	public Vector<Profil> getProfiles(){
		return null;
	}
	
	public Vector<Profil> getProfilesBySuchprofil(Suchprofil sp){
		return null;
	}
	
	public Vector<Profil> getProfilesByMerkzettel(Merkzettel mz){
		return null;
	}
	
	public Vector<Profil> getProfilesByKontaksperre(Kontaktsperre ks){
		return null;
	}
	
	
	
	//@param GoogleWhatever
	public Profil getProfilByGoogleID(){
		return null;
	}
	
	
	
	//Merkzettel
	
	public Merkzettel[] getAllMerkzettelByProfil(Profil p){
		return null;
	}
	
	
	
	//Kontaktsperre
	
	public Kontaktsperre[] getAllKontaktsperreByProfil(Profil p){
		return null;
	}
	
	
	
	//Suchprofil
	
	public Suchprofil getSuchprofilByProfil(Profil p){
		return null;
	}
	
}
