package com.ninganzaremy;

import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;


public class PopulateTableFromFile {
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopulateTableFromFile window = new PopulateTableFromFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel {

		int[][] allData;
		private static final long serialVersionUID = 5269336138636744405L;
		
		public TableData() {
		
			loadFile("data.csv");
		}
		
		void loadFile(String fileName) {
			Path file = FileSystems.getDefault().getPath("", fileName);
			try {
				List<String> lines = Files.readAllLines(file);
				for(int i = 0; i < lines.size(); i++) {
					String line = lines.get(i);
					String[] lineArray = line.split(",");
					if(allData == null) {
						allData = new int[lines.size()][lineArray.length];
					}
					for(int j = 0; j < lineArray.length; j++) {
						int parsedInt = Integer.parseInt(lineArray[j]);
						allData[i][j] = parsedInt;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
		}
		
	}

	/**
	 * Create the application.
	 */
	public PopulateTableFromFile() {
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
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(20, 15, 410, 243);
		frame.getContentPane().add(table);
		
		TableData data = new TableData();
		table.setModel(data);
	}

}
