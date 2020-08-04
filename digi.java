package cis368.midterm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.*;
import javafx.geometry.Point2D;
import java.util.*;



public class digi extends Application {
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		
			digi2 c1 = new digi2();
			
		 	digiPane map = new digiPane();
		 	
		    Scene scene = new Scene(c1, 600, 300);
		    primaryStage.setTitle("Digital Clock"); // Set the stage title
		    primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show(); // Display the stage
		    
		    c1.setOnKeyPressed(e -> {
		        if (e.getCode() == KeyCode.UP) {
		          c1.enlarge(); // Enlarge the map
		        }
		        else if (e.getCode() == KeyCode.DOWN) {
		          c1.shrink(); // Shrink the map
		        }
		      });
		    c1.requestFocus();
	}
	class digiPane extends BorderPane {
	    private Group group = new Group();
	    
	    digiPane() {
	    	
	    }
	    	
	    	
	    }
	public static void main(String[] args) {
	    launch(args);
	  }
}