package com.ninganzaremy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import java.awt.BorderLayout;

public class TablesInSwing {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesInSwing window = new TablesInSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	class TableData extends AbstractTableModel {

		int [][]  allData = new int[3][3];
		
		private static final long serialVersionUID = -5670273263235110464L;
		public TableData() {
			allData[0] = new int[] {1,2,3};
			allData[1] = new int[] {4,5,6};
			allData[2] = new int[] {7,8,9};


		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return allData.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return allData[rowIndex][columnIndex];
		}};

	/**
	 * Create the application.
	 */
	public TablesInSwing() {
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
		
		table = new JTable();
		table.setBounds(0, 0, 436, 0);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(57, 44, 323, 185);
		frame.getContentPane().add(table_1);
		
		TableData data = new TableData();
		table.setModel(data);
		
	}
}
