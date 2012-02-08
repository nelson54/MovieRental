package com.rentalcompany.rentman.main.java.ui.rental;

import javax.swing.*;
import javax.swing.table.TableModel;

/**
 * Created by IntelliJ IDEA.
 * User: dnelson
 * Date: 2/7/12
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentalRowFilter extends RowFilter {
    public String filterText;

    public void setFilterText(String filterText){
        this.filterText = filterText;
    }

    @Override
    public boolean include(Entry entry) {
        for (int i = entry.getValueCount() - 1; i >= 0; i--) {
            if (entry.getStringValue(i).contains(filterText)) {
                // The value starts with "a", include it
                return true;
            }
        }
        // None of the columns start with "a"; return false so that this
        // entry is not shown
        return false;
    }
}
