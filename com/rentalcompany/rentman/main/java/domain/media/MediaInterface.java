package com.rentalcompany.rentman.main.java.domain.media;

import java.util.List;

public interface MediaInterface {
	String getId();
	String getTitle();
	String getYear();
	
	String getGenre();
	List<Genre> getGenres();
	
	
	
	Integer numberOfDiscs();
}
