package com.cis111b.gui;

import java.util.ArrayList;

import com.cis111b.model.*;

public class SearchDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<TaxonomicUnit> list = new ArrayList<TaxonomicUnit>();
		list.add(new TaxonomicUnit(3443));
		list.add(new TaxonomicUnit(45645));
		list.add(new TaxonomicUnit(56745));
		list.add(new TaxonomicUnit(43564));
		list.add(new TaxonomicUnit(34534));
		SearchResults resultsPage = new SearchResults(list);
		resultsPage.setVisible(true);

	}

}
