package org.chou.demo.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.chou.demo.JavaFXApplication;
import org.chou.demo.context.AppContext;
import org.chou.demo.model.LoginModel;
import org.chou.demo.view.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

@FXMLController
public class LoginController implements Initializable{
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@Autowired
	private MainView mainView;

	public TextField getUsername() {
		return username;
	}

	public void setUsername(TextField username) {
		this.username = username;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}
	
	public void login(ActionEvent actionEvent) {
		String usernameStr = username.getText();
		String passwordStr = password.getText();
		
		if ("zhao.jiahong".endsWith(usernameStr) && "zhao.jiahong".endsWith(passwordStr)) {
			LoginModel loginModel = new LoginModel();
			loginModel.setUsername(usernameStr);
			loginModel.setPassword(passwordStr);
			AppContext.getAppContext().put(this.getClass().getSimpleName(), loginModel);
			JavaFXApplication.getScene().setRoot(mainView.getView());
		} else {
			username.clear();
			password.clear();
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setContentText("username or password is wrong!");
			alert.show();
		}
			
	}
	
	public void cancel(ActionEvent actionEvent) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setContentText("You clicked cancel button!");
		alert.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
