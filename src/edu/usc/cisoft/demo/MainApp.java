package edu.usc.cisoft.demo;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root, 400, 400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			FXMLLoader loader = new FXMLLoader();
//			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
//			rootLayout = (BorderPane) loader.load();
//			
//			Scene scene = new Scene(rootLayout);
//			primaryStage.setScene(scene);
//			primaryStage.show();
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("SOSNet Comprehensive Visulization");
			
			initRootLayout();
			
			showMainScene();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Initializes the root layout
	 */
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMainScene() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MainScene.fxml"));
			AnchorPane mainScene = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(mainScene);
			
			// Give the controller access to the main app.
			//MainSceneController controller = loader.getController();
			//controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
