package de.LG.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.LG.shared.BO.Eigenschaft;
import de.LG.shared.BO.Info;
import de.LG.shared.BO.Profil;
import de.LG.shared.BO.Suchprofil;

@RemoteServiceRelativePath("editor")
public interface EditorService extends RemoteService {
	
	/* Demo-Methode um die Funktionalität zw. ServicesInterfaces und Servlet
	*  zu testen
	*/
	String hello(String name);
	
	void profilErstellen(Profil p);
	
	void aehnlichkeitBerechnen(Profil referenz);
	
	void updateProfil(Profil p);
	
	Vector<Eigenschaft> getAuswahlEigenschaften();
	
	Vector<Eigenschaft> getFreieEigenschaften();
	
	Vector<Info> getInfos();
	
	void setInfoForProfile(Profil p, Info[]infos);
	
	Vector<Info> getInfoByProfil(Profil p);
	
	void updateSuchProfil(Suchprofil sp);
}
