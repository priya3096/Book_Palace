package com.niit.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.database.dao.GenreDAO;
import com.niit.database.model.Genre;

@Controller
public class GenreController {
	
	private GenreDAO genreDAO;
	
	@Autowired(required=true)
	@Qualifier(value="genreDAO")
	public void setGenreDAO(GenreDAO ps){
		this.genreDAO=ps;
	}
	
	@RequestMapping(value="/genres", method=RequestMethod.GET)
	public String listGenres(Model model){
		model.addAttribute("genre", new Genre());
		model.addAttribute("genreList",this.genreDAO.list());
		return "genre";
	}


}


  
