package proyecto.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.demo.entities.Actor;
import proyecto.demo.repository.ActorRepository;

@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> findAll() {
		return actorRepository.findAll();
	}
}
