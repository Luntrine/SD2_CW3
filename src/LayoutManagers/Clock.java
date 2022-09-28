package LayoutManagers;

//Imports what is needed for the GUI.
import java.awt.*;
import javax.swing.*;

//imports what is needed for the clock calculations.
import java.util.Calendar;

public class Clock extends JFrame{
	
	private JLabel hours, minutes, seconds, amPM;
	Font font = new Font("Arial", Font.BOLD, 30);
	
	public Clock() {
		setLayout(new GridLayout(2,1,5,5));
		
		//The following code adds the panels with their border gaps to the clock GUI.
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3,5,5));
		add(p);
		
		JPanel q = new JPanel();
		q.setLayout(new GridLayout(1,1,5,5));
		add(q);
		
		//The following code adds the temporary text inside of their panels to the clock GUI.
		//It also sets the permanent font and borders.
		
		hours = labelCreator("HH");
		p.add(hours);
		
		minutes = labelCreator("MM");
		p.add(minutes);

		seconds = labelCreator("SS");
		p.add(seconds);
		
		amPM = labelCreator("AM/PM");
		q.add(amPM);
	}
	
	//Creates an instance of a custom JLabel object if called.
	private JLabel labelCreator(String text)
	{
		JLabel l = new JLabel(text,JLabel.CENTER);
		l.setBackground(Color.white);
		l.setOpaque(true);
		l.setFont(font);
		l.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		return l;
	}
	
	//The pause method pauses the program for a certain number of milliseconds. 
	//Used so the time method does not crash when being run in the TestClock class.
	private void pause(long millisecs)
	{  
		long current = Calendar.getInstance().getTimeInMillis();
		while(Calendar.getInstance().getTimeInMillis()-current<millisecs);
	}
	
	public void time()
	{
		//The following code changes all 0s to 12s when referring to hours
		//as the project specifies 12 hour time and not 24 hour time.
		//It then changes the hours label to the converted to string value of Calendar.HOUR.
		int timeInHours = Calendar.getInstance().get(Calendar.HOUR);
		if(timeInHours == 0)
		{
			hours.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR) + 12));
		}
		else
		{
			hours.setText(String.valueOf(Calendar.getInstance().get(Calendar.HOUR)));
		}
		
		//The following code changes the minutes label to the converted to string value of Calendar.MINUTE.
		minutes.setText(String.valueOf(Calendar.getInstance().get(Calendar.MINUTE)));
		
		//The following code changes the minutes label to the converted to string value of Calendar.SECOND.
		seconds.setText(String.valueOf(Calendar.getInstance().get(Calendar.SECOND)));
		
		//The following code checks whether it is morning or past noon with boolean isPM.
		//Morning = 0, Afternoon = 1. It then sets amPM to AM or PM depending on the binary
		//value of isPM.
		int isPM = Calendar.getInstance().get(Calendar.AM_PM);
		
		if(isPM == 1)
		{
			amPM.setText("PM");
		}
		else
		{
			amPM.setText("AM");
		}
		
		//The following code uses the aforementioned pause method to not crash the program.
		pause(100);
	}
}