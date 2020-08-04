package cis368.midterm;

import java.util.Calendar; 
import java.util.GregorianCalendar;
import java.util.Locale;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;

public class digi2 extends BorderPane{

	private Group group = new Group();
	
	public digi2() {
		paintRect();
	}
	
	public void paintRect(){
		
		String ampm, out = "";
		String out2 = " ";
		String out3 = " ";
		String sDay = " ";
		String month = "";
		GregorianCalendar gcal = new GregorianCalendar();
		int am_pm = gcal.get(Calendar.AM);
		
		if (am_pm == 0) {
			ampm = "AM";
		}else {
			ampm = "PM";
		}
		out+="0"+gcal.get(Calendar.HOUR)+":"+gcal.get(Calendar.MINUTE)+":"+gcal.get(Calendar.SECOND);
		out2+= ampm;
		out3+= gcal.get(Calendar.SECOND);
		sDay+= gcal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())+" - ";
		month+= gcal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+ " " +gcal.get(Calendar.DAY_OF_MONTH);
	  //Rectangle rect1 = new Rectangle(x, y, width, height);
		Rectangle rect1 = new Rectangle(125, 90, 325, 80 );
		rect1.setFill(Color.BLACK);
		
		Text time = new Text(150, 135, out);
		Text time2 = new Text(360, 110, out2);
		Text time3 = new Text(360, 130, out3);
		Text day = new Text(175, 160, sDay);
		Text monthOut = new Text(300, 160, month);
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 40);
		Font font2= Font.font("Verdana", FontWeight.BOLD, 20);
		Font font3= Font.font("Verdana", FontWeight.BOLD, 15);
		
		time.setFont(font);
		time2.setFont(font2);
		time3.setFont(font2);
		day.setFont(font3);
		monthOut.setFont(font3);
		time.setFill(Color.WHITESMOKE);
		time2.setFill(Color.WHITESMOKE);
		time3.setFill(Color.WHITESMOKE);
		day.setFill(Color.WHITESMOKE);
		monthOut.setFill(Color.WHITESMOKE);
		group.getChildren().clear(); // Clear the pane
		 group.getChildren().addAll(rect1, time, time2, time3, day, monthOut);
		 group.setScaleX(2); 
	      group.setScaleY(2);
	      this.setCenter(group);
	      
	}
	public void enlarge() {
	      group.setScaleX(1.1 * group.getScaleX());
	      group.setScaleY(1.1 * group.getScaleY());
	    }

	    public void shrink() {
	      group.setScaleX(0.9 * group.getScaleX());
	      group.setScaleY(0.9 * group.getScaleY());
	    }
}
