package org.chou.demo.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.chou.demo.context.AppContext;
import org.chou.demo.model.LoginModel;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

@FXMLController
public class MainController implements Initializable {

	@FXML
	private Label welcome;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		LoginModel loginModel = (LoginModel)AppContext.getAppContext().get(LoginController.class.getSimpleName());
		System.out.println("username:" + loginModel.getUsername());
		System.out.println("password:" + loginModel.getPassword());
		welcome.setText("Welcome, " + loginModel.getUsername());
	}

	public Label getWelcome() {
		return welcome;
	}

	public void setWelcome(Label welcome) {
		this.welcome = welcome;
	}
}
