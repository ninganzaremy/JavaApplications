package com.ninganzaremy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckBox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox window = new CheckBox();
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
	public CheckBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		frame.setBounds(100, 100, 932, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Off");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(136, 136, 49, 14);
		frame.getContentPane().add(label);
		
		JCheckBox CheckBox = new JCheckBox("Toogle On/Off");
		CheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = (CheckBox.isSelected()) ? "On" : "Off";
				label.setText(txt);
			}
		});
		CheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CheckBox.setBounds(99, 76, 139, 51);
		frame.getContentPane().add(CheckBox);
		
		
	}
}
