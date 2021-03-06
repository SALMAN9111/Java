package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE")
public class Movie {
	  @Id
	  private int id;
	  private String movieName;

	  @ManyToMany(mappedBy = "movies")
	  private Set<Actor> actors = new HashSet<Actor>();
	  

	  public Movie(int id, String movieName) {
	    this.id = id;
	    this.movieName = movieName;
	  }


	  public Set<Actor> getActors() {
	    return actors;
	  }

	  public void setActors(Set<Actor> actors) {
	    this.actors = actors;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getMovieName() {
	    return movieName;
	  }

	  public void setMovieName(String movieName) {
	    this.movieName = movieName;
	  }

}
