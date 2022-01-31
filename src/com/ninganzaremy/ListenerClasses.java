package com.ninganzaremy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListenerClasses {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListenerClasses window = new ListenerClasses();
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
	public ListenerClasses() {
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
		
		/* To delete a component
		 * 
		 * JLabel label = new JLabel("New label");
		   label.setBounds(79, 71, 49, 14);
		   frame.getContentPane().add(label);
		   	JButton btnCreateLabel = new JButton("Delete Label");
		btnCreateLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    frame.getContentPane().remove(label);
				frame.revalidate();
				frame.repaint();
			}
		});
		   *
		   */
		
		JButton btnCreateLabel = new JButton("Create Label");
		btnCreateLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label = new JLabel("New label");
				label.setBounds(79, 71, 49, 14);
				frame.getContentPane().add(label);
				frame.revalidate();
				frame.repaint();
			}
		});
		btnCreateLabel.setBounds(44, 11, 203, 23);
		frame.getContentPane().add(btnCreateLabel);
		
		
		
	}

}
