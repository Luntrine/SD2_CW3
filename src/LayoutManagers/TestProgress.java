package LayoutManagers;

import javax.swing.JFrame;

public class TestProgress {

	public static void main(String[] args) {
		//The following code creates the Progress object and sets it up.
		Progress progress = new Progress();
		progress.setTitle("progress");
		progress.setSize(120,1280);
		progress.setVisible(true);
		progress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//The following code runs progressAdder.
		progress.progressAdder();
	}

}
