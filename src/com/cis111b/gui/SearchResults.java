package com.cis111b.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import com.cis111b.model.TaxonomicUnit;

public class SearchResults extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6426273903860992190L;
	private JPanel contentPane;
	private JTable table;



	/**
	 * Create the frame.
	 */
	public SearchResults(ArrayList<TaxonomicUnit> results) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JTable(new SearchTableModel(results));
		//contentPane.add(table, BorderLayout.CENTER);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		// Create the scroll pane and add the table to it.
		JScrollPane scrollPane = new JScrollPane(table);
		// Add the scroll pane to this panel.
		add(scrollPane);
	}

}
