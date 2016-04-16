package de.LG.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import de.LG.shared.EditorService;
import de.LG.shared.EditorServiceAsync;

	


public class ITLGrotte implements EntryPoint {

	
	private TextBox textbox = new TextBox();
	private Button button = new Button();
	
	private final EditorServiceAsync editorService = GWT.create(EditorService.class);

	public void onModuleLoad() {
		
		button.addClickHandler(new GreetHandler());
		button.setText("Klick mich hart");

		RootPanel.get("greet").add(textbox);
		
		RootPanel.get("greet").add(button);
		
	}
	
	private class GreetCallback implements AsyncCallback<String>{
		public void onFailure(Throwable caught) {
			RootPanel.get("greet").add(new Label("Es geeeeht nicht :("));
		}
		public void onSuccess(String result) {
			RootPanel.get("greet").add(new Label(result));
		}
	}
	
	private class GreetHandler implements ClickHandler {
		public void onClick(ClickEvent e){
			editorService.hello(textbox.getText(), new GreetCallback());
		}
	}
}
