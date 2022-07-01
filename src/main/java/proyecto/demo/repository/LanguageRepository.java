package proyecto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.demo.entities.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{
	
	

}