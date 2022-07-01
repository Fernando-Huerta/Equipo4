package proyecto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.demo.entities.Actor;

public interface ActorRepository  extends JpaRepository<Actor, Integer> {

}
