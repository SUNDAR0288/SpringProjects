package com.basic.springboot02.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basic.springboot02.dataaccess.MovieListRepository;
import com.basic.springboot02.movies.model.Movie;

@Controller
@RequestMapping("/")
public class MovieListController {

	@Autowired
	private MovieListRepository movieListRepository;
	
	@RequestMapping(value = "/movie/{actor}", method = RequestMethod.GET)
	public String HelloWorld(@PathVariable("actor")String name, Model model) {
		
		/*List<Movie> movielist = new ArrayList<>();
		Movie movie = new Movie();
		movie.setActor("Luffy");
		movie.setDescription("One Piece");
		movie.setName("OP");
		movielist.add(movie);*/
		
		List<Movie> movielist = movieListRepository.findMoviesByActor(name);
		
		model.addAttribute("movies",movielist);
		
		return "MovieList";
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/movie", consumes="application/json")
	public ResponseEntity<Object> addMovie(@RequestBody Movie movie){
		
		movieListRepository.save(movie);
		return ResponseEntity.ok().build();
	}
}
