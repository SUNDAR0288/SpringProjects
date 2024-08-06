package com.basic.springboot02.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.springboot02.movies.model.Movie;
@Repository
public interface MovieListRepository extends JpaRepository<Movie, Long>{
	
	
	List<Movie> findMoviesByActor(String name);

}
