package tests;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {

	public static void main(String[] argv) {
		launch();
	}

	public static LwjglApplication launch(){
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "box2d lights test";
		config.width = 800;
		config.height = 480;
		config.samples = 4;
		config.depth = 0;
		config.vSyncEnabled = true;

		config.fullscreen = false;

		System.out.println("launching a desktop app");
		LwjglApplication app =  new LwjglApplication(new Box2dLightTest(), config);
		System.out.println("done launching a desktop app");
		return app;
	}

}
