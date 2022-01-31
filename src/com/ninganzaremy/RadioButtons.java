package com.ninganzaremy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtons {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioButtons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Item1");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(35, 22, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnItem_1 = new JRadioButton("Item2");
		buttonGroup.add(rdbtnItem_1);
		rdbtnItem_1.setBounds(35, 59, 111, 23);
		frame.getContentPane().add(rdbtnItem_1);
		
		JRadioButton rdbtnItem = new JRadioButton("Item3");
		buttonGroup.add(rdbtnItem);
		rdbtnItem.setBounds(35, 100, 111, 23);
		frame.getContentPane().add(rdbtnItem);
	}
}
