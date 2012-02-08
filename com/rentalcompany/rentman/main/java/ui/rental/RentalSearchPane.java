package com.rentalcompany.rentman.main.java.ui.rental;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: dnelson
 * Date: 2/7/12
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentalSearchPane extends JToolBar {

    JTextField searchBox;
    
    JButton searchButton;

    public RentalSearchPane(){
        searchBox = new JTextField();
        searchBox.setToolTipText("Search");
        
        searchButton = new JButton("Search");
        
        add(searchBox);
        add(searchButton);
    }

    public JButton getSearchButton(){
        return searchButton;
    }

    public JTextField getSearchBox(){
        return searchBox;
    }
}
