package de.LG.shared;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("editor")
public interface EditorService extends RemoteService {
	
	String hello(String name);
}
