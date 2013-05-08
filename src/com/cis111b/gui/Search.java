package com.cis111b.gui;

import gov.usgs.itis.itis_service.data.CommonNames;
import gov.usgs.itis.itis_service.data.SvcCommonNameList;
import com.cis111b.model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.google.gson.Gson;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;

public class Search extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1118602589921602576L;
	private JPanel contentPane;
	private JTextField txtSearchString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame..l
	 */
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Taxon");
		contentPane.add(lblNewLabel, "4, 4, right, default");
		String[] taxonList = {"TaxonomicUnit","Animalia","Plantae","Canidae","Felidae","Tracheophyta","Bryophyta"};
		final JComboBox<String> cboTaxonomicGroup = new JComboBox<String>(taxonList);
		
		
		
		contentPane.add(cboTaxonomicGroup, "6, 4, fill, default");
		
		JLabel lblNewLabel_1 = new JLabel("Search String");
		contentPane.add(lblNewLabel_1, "4, 8, right, default");
		
		txtSearchString = new JTextField();
		contentPane.add(txtSearchString, "6, 8, fill, default");
		txtSearchString.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Search");
				String selectedTaxon = (String)cboTaxonomicGroup.getSelectedItem();
				String keyword = txtSearchString.getText();
				keyword = keyword.replaceAll(" ", "&");
				
				try {
					URL url = new URL("http://www.itis.gov/ITISWebService/jsonservice/searchByCommonName?srchKey=" + keyword);
					InputStream urlInputStream = url.openConnection().getInputStream();
					BufferedReader br = new BufferedReader(
						new InputStreamReader(urlInputStream, "UTF-8"));
					StringBuilder sb = new StringBuilder();
					 
					String line;
					
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}
					
					//System.out.println(sb.toString());
					Gson gson = new Gson();
					SvcCommonNameList commonNames = new SvcCommonNameList();
					ArrayList<TaxonomicUnit> results = new ArrayList<TaxonomicUnit>();
					commonNames = gson.fromJson(sb.toString(), SvcCommonNameList.class);
					Class<? extends TaxonomicUnit> resultClass = Class.forName("com.cis111b.model." + selectedTaxon).asSubclass(TaxonomicUnit.class);
					
					
					for (CommonNames name: commonNames.getCommonNames()) {
						// System.out.println(name.getCommonName());
						//TaxonomicUnit result = new TaxonomicUnit(name.getTsn());
						
						
						//Object result = (Object)resultClass.getConstructor(resultClass);
						try {
							TaxonomicUnit result = resultClass.getDeclaredConstructor(Integer.class).newInstance(name.getTsn());
							//resultClass.getDeclaredConstructor(Integer.class).newInstance(name.getTsn());
							if (result.getKingdom() == null) {
								continue;
							}
							result.setCommonName(name.getCommonName());
							results.add(result);
							System.out.println (result.getCommonName());
						} catch (InvocationTargetException e) {
							//e.printStackTrace();
							System.err.println("Caught");
							continue;
						}
					}
						
						
					
					//System.out.println(results.size());
					SearchResults page = new SearchResults(results);
		            page.setVisible(true);
			 
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			 
				
			}
		});
		contentPane.add(btnSearch, "6, 12");
	}
}
