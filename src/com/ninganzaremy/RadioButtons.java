package com.ninganzaremy;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class RadioButtons {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel label = new JLabel("");

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
	class RadioListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton)e.getSource();
			label.setText(btn.getText());
			
		}
		
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
		
		RadioListener listener = new RadioListener()
		
		JRadioButton item1 = new JRadioButton("Item1");
		buttonGroup.add(item1);
		item1.setBounds(35, 22, 111, 23);
		frame.getContentPane().add(item1);
		item1.addActionListener(listener);
		
		JRadioButton item2 = new JRadioButton("Item2");
		buttonGroup.add(item2);
		item2.setBounds(35, 59, 111, 23);
		frame.getContentPane().add(item2);
		item2.addActionListener(listener);

		
		JRadioButton item3 = new JRadioButton("Item3");
		buttonGroup.add(item3);
		item3.setBounds(35, 100, 111, 23);
		frame.getContentPane().add(item3);
		item3.addActionListener(listener);

		
		label.setBounds(69, 151, 148, 14);
		frame.getContentPane().add(label);
	}
}
