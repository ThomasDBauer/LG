package de.LG.shared;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("editor")
public interface EditorService extends RemoteService {
	
	/* Demo-Methode um die Funktionalität zw. ServicesInterfaces und Servlet
	*  zu testen
	*/
	String hello(String name);
}
