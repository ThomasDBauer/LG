package de.LG.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.LG.shared.BO.Eigenschaft;
import de.LG.shared.BO.Info;
import de.LG.shared.BO.Profil;
import de.LG.shared.BO.Suchprofil;

public interface EditorServiceAsync {
	
	void hello(String name, AsyncCallback<String> callback);
	
	void profilErstellen(Profil p, AsyncCallback callback);
	
	void aehnlichkeitBerechnen(Profil referenz, AsyncCallback callback);
	
	void updateProfil(Profil p, AsyncCallback callback);
	
	void getAuswahlEigenschaften(AsyncCallback <Vector<Eigenschaft>> callback);
	
	void getFreieEigenschaften(AsyncCallback<Vector<Eigenschaft>> callback);
	
	void getInfos(AsyncCallback <Vector<Info>> callback);
	
	void setInfoForProfile(Profil p, Info[]infos, AsyncCallback callback);
	
	void getInfoByProfil(Profil p, AsyncCallback<Vector<Info>>callback);
	
	void updateSuchProfil(Suchprofil sp, AsyncCallback callback);
	
}
