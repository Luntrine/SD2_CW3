package LayoutManagers;

//Imports what is needed for the GUI.
import java.awt.*;
import javax.swing.*;

//imports what is needed for the progress bar scanning.
import java.util.Scanner;

public class Progress extends JFrame 
{
	JLabel[] progressBar = new JLabel[10];
	private JLabel percent;
	
	public Progress() 
	{
		setLayout(new GridLayout(1,1,5,5));
		
		//The following code adds the panel that will be used as the progress bar.
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(11,1));
		add(p);
		
		Font timeFont = new Font("Arial", Font.BOLD, 30);
		
		//The following code creates the labels inside of the panel that act as the progress
		//bar. They are by default set to red.
		for(int i = 0; i < 10; i++)
		{
			progressBar[i] = new JLabel("",JLabel.CENTER);
			progressBar[i].setBackground(Color.red);
			progressBar[i].setOpaque(true);
			progressBar[i].setFont(timeFont);
			p.add(progressBar[i]);
		}
		
		//The following code creates the percent panel, displaying how much the user has progressed.
		percent = new JLabel("0%",JLabel.CENTER);
		percent.setBackground(Color.white);
		percent.setOpaque(true);
		percent.setFont(timeFont);
		p.add(percent);
	}
	
	public void progressAdder() 
	{
		int progressPercent = 0;
		
		//The following code increments the progress bar by changing it green every time
		//the enter key is input using a scanner object and a for loop. It also increments
		//the progress percent.
		for(int i = 0; i < 10; i++)
		{
			Scanner enterKey = new Scanner(System.in);
		    String enterKeyInput = enterKey.nextLine();
		    
		    if(enterKeyInput.equals("")){
		    	progressBar[i].setBackground(Color.green);
		    	progressPercent = progressPercent + 10;
			    percent.setText(String.valueOf(progressPercent) + "%");
		    }
		    else {
		    	i--;
		    }
		}	
	}
}