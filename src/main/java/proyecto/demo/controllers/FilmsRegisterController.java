package proyecto.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import proyecto.demo.entities.Actor;
import proyecto.demo.entities.Category;
import proyecto.demo.entities.Film;
import proyecto.demo.entities.Language;
import proyecto.demo.services.ActorService;
import proyecto.demo.services.CategoryService;
import proyecto.demo.services.FilmService;
import proyecto.demo.services.LanguageService;

@Controller
public class FilmsRegisterController {

	@Autowired
	private FilmService filmService;

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ActorService actorService;
	
	@Autowired
	private LanguageService languageService;
	
	@GetMapping(value="films")
	public String registerFilmForm(Model model) {
		List <Category> categories = categoryService.findAll();
		List <Actor> actors = actorService.findAll();
		List<Language> languages=languageService.findAll();

		model.addAttribute("film", new Film());
		model.addAttribute("categories", categories);
		model.addAttribute("actors", actors);
		model.addAttribute("languages", languages);
		
		return "/views/films";
	}
	
	
	@GetMapping(value="film-register")
	public String registerFilm(@ModelAttribute("film") Film film,  HttpServletRequest request) {
		System.out.println(film);
		filmService.guardar(film);
		return "/views/films";
	}
	
	
}
