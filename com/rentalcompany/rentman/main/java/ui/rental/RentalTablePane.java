package com.rentalcompany.rentman.main.java.ui.rental;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.regex.Pattern;


/**
 * Created by IntelliJ IDEA.
 * User: dnelson
 * Date: 2/7/12
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class RentalTablePane extends JPanel {
    JTable rentalTable;
    JTableHeader tableHeader;
    JScrollPane tableScrollPane;
    JPanel tablePanel;
    RentalRowFilter rowFilter;
    TableRowSorter<TableModel> sorter;

    public RentalTablePane(){
        super();

        rowFilter = new RentalRowFilter();
        rowFilter.setFilterText("12");

        rentalTable = new JTable();
        rentalTable.setAutoCreateRowSorter(true);
        tableScrollPane = new JScrollPane(rentalTable);
        
        tableHeader = rentalTable.getTableHeader();

        add(tableHeader);
        add(tableScrollPane);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        sorter = new TableRowSorter<TableModel>(rentalTable.getModel());
        rentalTable.setRowSorter(sorter);
    }
    
    public JTable getTable(){
        return rentalTable;
    }

    public void newFilter(String textFilter) {
        RowFilter<TableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(".*" + Pattern.quote(textFilter) + ".*" ,1);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
        rentalTable.setRowSorter(sorter);
    }
}
