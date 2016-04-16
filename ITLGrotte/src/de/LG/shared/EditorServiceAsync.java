package de.LG.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

public interface EditorServiceAsync {
	
	void hello(String name, AsyncCallback<String> callback);
}
