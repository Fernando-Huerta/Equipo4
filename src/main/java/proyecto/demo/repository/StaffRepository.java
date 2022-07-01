package proyecto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.demo.entities.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer>{

	public abstract Staff findByUsername(String userName);
}