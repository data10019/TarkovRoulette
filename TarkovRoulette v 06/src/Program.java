// Author: Jason Nickell
// Tarkov Roulette program

//imports
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
//import java.awt.*;

//Contains main method and GUI.
public class Program extends JFrame
{
	/**
	 * not sure what serial version is but eclipse says i want 1 lol
	 */
	private static final long serialVersionUID = -6273377146590330484L;
	
	
	//Fields 
	private JPanel panel;
	private JTextArea outputDisplay;
	private JTextArea rulesDisplay;
	private JCheckBox time;
	private JCheckBox map;
	private JCheckBox weapon;
	private JButton run;
	
	//Default window Size
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 350;
	
	//Components
	public Program()
	{
		//Build the panel that contains the other components
		buildPanel();
		
		//Add panel to content panel
		JFrame window = new JFrame("Tarkov Roulette - version .06");
		window.add(panel);
		
		//Size and display of the window
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setVisible((true));
		
		//Specify what happens when the close button is clicked.
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Build panel method.
	private void buildPanel()
	{
		//run button
		run = new JButton("May the dice gods be with you");
		run.addActionListener(new ButtonListener());
		
		//Check boxes
		time = new JCheckBox("Time of day");
		map = new JCheckBox("Map selection");
		weapon = new JCheckBox("Weapon Selection");
		
		//text boxes
		outputDisplay = new JTextArea(5,15);
		outputDisplay.setEditable(false);
		rulesDisplay = new JTextArea(5,15);
		rulesDisplay.setEditable(false);
		
		//Scroll bar dont think its working
		JScrollPane scroll = new JScrollPane(outputDisplay);
   	 	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		//panel setup
		panel = new JPanel();
		panel.add(run, BorderLayout.NORTH);
		panel.add(time, BorderLayout.CENTER);
		panel.add(map, BorderLayout.CENTER);
		panel.add(weapon, BorderLayout.CENTER);
		panel.add(outputDisplay, BorderLayout.SOUTH);
		panel.add(rulesDisplay, BorderLayout.SOUTH);
		
		rulesDisplay.setText("Tarkov Roulette\n" + "If you cant figure out weapon type... google it.");
		
	}
	
	//Class for action on button
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//clears output
			outputDisplay.setText("");
			
			if (time.isSelected())
			{
				outputDisplay.append("\n" + "Time of day: " + TimeOfDay.getTime() + "\n");
			}
			if (map.isSelected())
			{
				outputDisplay.append("\n" + "Map: " + MapSelect.getMap() + "\n");
			}
			if(weapon.isSelected())
			{
				outputDisplay.append("\n" + "Weapon type: " + WeaponType.getWeapon() + "\n");
			}
		}
	}
	

	public static void main(String[] args) 
	{
		Program tr = new Program();

	}

}
