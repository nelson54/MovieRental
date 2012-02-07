package com.rentalcompany.rentman.main.java.domain.rental;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;

public abstract class Rentable {
	private Boolean rented;
	
	private enum SalesType { ONEDAY, TWODAY, THREEDAY, WEEK };
	
	private DateTime rentDate;
	private DateTime dueDate;
	private DateTime returnDate;
	
	public Integer basePrice;
	
	public Boolean isOverdue(){
		return dueDate.isBeforeNow();
	};
	
	public abstract Boolean isRented();
	
	public abstract Integer getPrice();
	
	public int getOverdueInDays(){
		if(isOverdue())
			return Days.daysBetween(dueDate, DateTime.now()).get(DurationFieldType.days());
		return 0;
	};
	
	public int getOverdueFee(){
		if (isOverdue())
			return getOverdueInDays() * getPrice();
		return 0;	
	}
}
