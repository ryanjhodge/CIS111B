package com.cis111b.gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import com.cis111b.model.*;

public class SearchTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2057827880440368438L;
	
	private String[] columnNames = { "Common Name", "Species", "Genus",
			"Family", "Division", "Kingdom" };
	
	ArrayList<TaxonomicUnit> list = null;

	SearchTableModel(ArrayList<TaxonomicUnit> list) {
		this.list = list;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public String getColumnName(int column) {
	    return columnNames[column];
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		TaxonomicUnit object = list.get(row);
		 
		switch (col) {
		case 0:
			return object.getCommonName();
		case 1:
			return object.getSpecies();
		case 2:
			return object.getGenus();
		case 3:
			return object.getFamily();
		case 4:
			return object.getDivision();
		case 5:
			return object.getKingdom();
		default:
			return "unknown";
		}
	}

}
