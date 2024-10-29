package com.aurionpro.model;

import java.io.Serializable;

public class Movie implements Serializable {

	private int movieId;
	private String movieName;
	private int year;
	private Genre genre;
	
	public enum Genre{
		Comedy,Action,Drama
	}

	public Movie(int movieId, String movieName, int year,String genre) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.year = year;
		this.genre = Genre.valueOf(genre);
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", year=" + year + ", genre=" + genre + "]";
	}
	
	
	
	
}
