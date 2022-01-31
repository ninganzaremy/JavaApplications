package com.ninganzaremy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class SwingBasics {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasics window = new SwingBasics();
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
	public SwingBasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(255, 200, 0));
		frame.setBounds(100, 100, 1364, 989);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(227, 45, 218, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(75, 89, 517, 41);
		frame.getContentPane().add(label);
		
		JButton NewButton = new JButton("Say Hi");
		NewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				label.setText("Hi " + textField.getText());
				
			}
		});
		NewButton.setBounds(455, 42, 127, 23);
		frame.getContentPane().add(NewButton);
		
		JLabel NameLabel = new JLabel("Enter Your Name: ");
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NameLabel.setBounds(65, 51, 138, 14);
		frame.getContentPane().add(NameLabel);
		
		
	}
}
