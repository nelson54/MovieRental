package com.rentalcompany.rentman.main.java;
import javax.swing.table.DefaultTableModel;

import com.rentalcompany.rentman.main.java.domain.media.MediaInterface;


public class RentalTableModel extends DefaultTableModel {
	RentalTableModel(){
		super();
	}

	public void addRow(MediaInterface media){
		addRow(new Object[]{media.getId(), media.getTitle(), media.getYear()});
	}
}
