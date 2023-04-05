package org.chou.demo;

import org.chou.demo.view.LoginView;
import org.springframework.context.annotation.ComponentScan;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;

@ComponentScan(basePackages = "org.chou.demo")
public class JavaFXApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launch(JavaFXApplication.class, LoginView.class, new CustomSplashScreen(), args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		super.start(stage);
	}
}
