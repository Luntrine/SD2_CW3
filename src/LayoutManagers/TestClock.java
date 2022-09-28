package LayoutManagers;
import java.awt.*;
import javax.swing.*;

public class TestClock {

	public static void main(String[] args) {
		//The following code creates the Clock object and sets it up.
		Clock clock = new Clock();
		clock.setTitle("Clock");
		clock.setSize(1280,720);
		clock.setVisible(true);
		clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//The following code runs infinitely.
		while(2<3) {
			clock.time();
		}

	}

}
