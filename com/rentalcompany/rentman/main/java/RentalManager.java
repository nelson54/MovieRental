package com.rentalcompany.rentman.main.java;

import javax.swing.JFrame;
import javax.swing.JTable;

import com.rentalcompany.rentman.main.java.domain.media.Genre;
import com.rentalcompany.rentman.main.java.domain.media.MediaType;
import com.rentalcompany.rentman.main.java.domain.media.MovieMedia;

public class RentalManager {

	public static void main( String args[]){
		new RentalManager();
	}
	
	public RentalManager(){
	
		RentalTableModel rentalModel = new RentalTableModel();
		MovieMedia media1 = new MovieMedia("Movie 1", "2005", MediaType.DVD, Genre.FAMILY);
		rentalModel.addRow( media1 );
		rentalModel.addRow( media1 );
		rentalModel.addRow( media1 );
		rentalModel.addRow( media1 );
		rentalModel.addRow( media1 );
		
		System.out.println(media1.getTitle());
		
		JTable rentalsTable = new JTable();
		rentalsTable.setModel(rentalModel);
		
		JFrame window = new JFrame();
		window.add(rentalsTable);
		window.setVisible(true);
		
		
	}
}
