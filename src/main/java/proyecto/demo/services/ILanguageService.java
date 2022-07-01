package proyecto.demo.services;

import java.util.Optional;

import proyecto.demo.entities.Language;

public interface ILanguageService {

	public Optional<Language> findById(Integer id);
}