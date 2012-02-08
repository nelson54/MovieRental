package com.rentalcompany.rentman.main.java;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.rentalcompany.rentman.main.java.domain.media.Genre;
import com.rentalcompany.rentman.main.java.domain.media.MediaType;
import com.rentalcompany.rentman.main.java.domain.media.MovieMedia;
import com.rentalcompany.rentman.main.java.ui.rental.RentalSearchPane;
import com.rentalcompany.rentman.main.java.ui.rental.RentalTableModel;
import com.rentalcompany.rentman.main.java.ui.rental.RentalTablePane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentalManager {
    private final RentalTablePane rentalsTable;
    private final RentalSearchPane searchPane;
	public static void main( String args[]){
		new RentalManager();
	}
	
	public RentalManager(){
	
		RentalTableModel rentalModel = new RentalTableModel();

        MovieMedia media1 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);
        MovieMedia media2 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);
        MovieMedia media3 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);
        MovieMedia media4 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);
        MovieMedia media5 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);

        rentalModel.addRow(media1);
		rentalModel.addRow(media2);
		rentalModel.addRow(media3);
		rentalModel.addRow(media4);
		rentalModel.addRow(media5);
		
		System.out.println(media1.getTitle());
		
		rentalsTable = new RentalTablePane();
		rentalsTable.getTable().setModel(rentalModel);
        //rentalsTable.newFilter("Movie");



        searchPane = new RentalSearchPane();

        searchPane.getSearchBox().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //e.getChange().toString();
                rentalsTable.newFilter(searchPane.getSearchBox().getText());
            }
        });

        JPanel pane = new JPanel();
        pane.setLayout(new BorderLayout());
        pane.add(searchPane, BorderLayout.NORTH);
        pane.add(rentalsTable, BorderLayout.CENTER);

		JFrame window = new JFrame();
        window.add(pane);
		window.setVisible(true);
	}
}
