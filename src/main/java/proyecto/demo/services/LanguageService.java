package proyecto.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.demo.entities.Language;
import proyecto.demo.repository.LanguageRepository;

@Service
public class LanguageService implements ILanguageService{

	@Autowired
	private LanguageRepository languageRepository;
	
	@Override
	public Optional<Language> findById(Integer id) {
		return languageRepository.findById(id);
	}

}
