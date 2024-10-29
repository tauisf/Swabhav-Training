package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	private int managerId;
	private  static   List<Movie> movies = new ArrayList<>();
	private List<Movie> managersMovies ; 
	private static  String path;
	public MovieManager(int managerId) {
		super();
		this.managerId = managerId;
		this.managersMovies= new ArrayList<>();
		this.path = path;
	}
	@Override
	public String toString() {
		return "MovieManager [managerId=" + managerId + ", movies=" + movies + ", path=" + path + "]";
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public void addMovies(Movie movie) {
		getMovies().add(movie);
	}
	
//	public void removeMovie() {
//		getMovies().removeAll(getMovies());
//	}
	public List<Movie> getManagersMovies() {
		return managersMovies;
	}
	public void setManagersMovies(List<Movie> managersMovies) {
		this.managersMovies = managersMovies;
	}

	public void addManagersMovies(Movie movie) {
		getManagersMovies().add(movie);
	}
	
	
	
}
