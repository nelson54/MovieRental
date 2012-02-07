package com.rentalcompany.rentman.main.java.domain.media;

import java.util.List;

import com.rentalcompany.rentman.main.java.domain.rental.Rentable;
import com.rentalcompany.rentman.main.java.domain.media.Genre;

public class MovieMedia extends RentableMedia{
	private String title;
	private String year;
	private MediaType type;
	private Genre genre;
	
	public MovieMedia(String title, String year, MediaType type, Genre genre){
		super();
		this.title = title;
		this.year = year;
		this.type = type;
		this.genre = genre;
	}

	@Override
	public String getId() {
		return "1";
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getYear() {
		return year;
	}

	@Override
	public String getGenre() {
		return genre.toString();
	}

	@Override
	public List<Genre> getGenres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer numberOfDiscs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isRented() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
