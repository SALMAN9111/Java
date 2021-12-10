package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table (name="ACTOR")
public class Actor {
	  @Id
	  private int id;
	  private String actorName;
	  
	  @ManyToMany
	  private Set<Movie> movies = new HashSet<Movie>();

	  
	  public Actor(int id, String actorName) {
	    super();
	    this.id = id;
	    this.actorName = actorName;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getActorName() {
	    return actorName;
	  }

	  public void setActorName(String actorName) {
	    this.actorName = actorName;
	  }

	  public Set<Movie> getMovies() {
	    return movies;
	  }

	  public void setMovies(Set<Movie> movies) {
	    this.movies = movies;
	  }
	  

}
