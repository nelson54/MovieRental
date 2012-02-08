package com.rentalcompany.rentman.main.java.ui.rental;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.rentalcompany.rentman.main.java.domain.media.MediaInterface;
import com.rentalcompany.rentman.main.java.domain.media.RentableMedia;


public class RentalTableModel extends DefaultTableModel {
	public RentalTableModel(){
		super();

		addColumn("Id");
        addColumn("Title");
        addColumn("Year");

    }

	public void addRow(RentableMedia media){

		super.addRow(new Object[]{media.getId(), media.getTitle(), media.getYear()});
	}
}
