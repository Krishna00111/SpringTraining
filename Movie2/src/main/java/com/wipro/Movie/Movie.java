package com.wipro.Movie;

public class Movie {
	
	String movieId;
	String movieName;
	String movieActor;
	String Date;
	String Time;
	
//	Movie() {
//		System.out.println("Movie Constructor");
//	}
	
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	
	
	
//	public void setUp() {
//		System.out.println("setup method of Movie");
//		
//	}
//	
//	public void clear() {
//		System.out.println("setup method of Movie");
//		
//	}
	
	
}
