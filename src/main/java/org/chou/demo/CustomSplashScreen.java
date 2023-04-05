package org.chou.demo;

import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Parent;

public class CustomSplashScreen extends SplashScreen {

	@Override
	public String getImagePath() {
		return "/images/logo.png";
	}

	@Override
	public Parent getParent() {
		Parent parent = super.getParent();
		parent.setLayoutX(150);
		parent.setLayoutY(100);
		return parent;
	}
	
}
