package edu.usc.cisoft.demo.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Rectangle;
import edu.usc.cisoft.demo.MainApp;

public class MainSceneController {
	@FXML
	private TilePane riskLevels;
	
	@FXML
	private TabPane dashBoard;
	
	private MainApp mainApp;
	
	public MainSceneController() {
		
	}
	
	@FXML
	private void initialize() {
		
//		Tab spatial = dashBoard.getTabs().get(0);
		
		ObservableList<Node> rects = riskLevels.getChildren();
		/*
		 * Register for the mouse events
		 */
		for (Node node : rects) {
			((Rectangle) node).setOnMouseClicked(event -> switchToFunctional());
		}
	}
	
	/**
	 * Switch to functional dashboard
	 */
	private void switchToFunctional() {
		// TODO Auto-generated method stub
		Tab functional = dashBoard.getTabs().get(1);
		SingleSelectionModel<Tab> selectionModel = dashBoard.getSelectionModel();
		selectionModel.select(functional);
	}

	@FXML 
	private void handleRiskLevel() {
		
	}

}
