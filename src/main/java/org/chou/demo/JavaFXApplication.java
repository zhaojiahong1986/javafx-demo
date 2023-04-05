package org.chou.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.chou.demo.view.LoginView;
import org.springframework.context.annotation.ComponentScan;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
import javafx.stage.Stage;

@ComponentScan(basePackages = "org.chou.demo")
public class JavaFXApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launch(JavaFXApplication.class, LoginView.class, new CustomSplashScreen(), args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFX-Demo");
		super.start(stage);
	}

	@Override
	public Collection<Image> loadDefaultIcons() {
		List<Image> images = new ArrayList<>();
		images.add(new Image(this.getClass().getResource("/images/FX01.png").toExternalForm()));
		images.add(new Image(this.getClass().getResource("/images/FX02.png").toExternalForm()));
		images.add(new Image(this.getClass().getResource("/images/FX03.png").toExternalForm()));
		images.add(new Image(this.getClass().getResource("/images/FX04.png").toExternalForm()));
		images.add(new Image(this.getClass().getResource("/images/FX05.png").toExternalForm()));
		return images;
	}
	
	
}
