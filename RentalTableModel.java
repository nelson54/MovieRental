import javax.swing.table.DefaultTableModel;

import com.rentalcompany.rentman.main.java.domain.media.MediaInterface;
import com.rentalcompany.rentman.main.java.domain.media.RentableMedia;


public class RentalTableModel extends DefaultTableModel {
	RentalTableModel(){
		super();
		
		this.setColumnIdentifiers(new Object[]{"id", "title", "year"});
	}

	public void addRow(RentableMedia media){
		this.addRow(new Object[]{media.getId(), media.getTitle(), media.getYear()});
	}
}
