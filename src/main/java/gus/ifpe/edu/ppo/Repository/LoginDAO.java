package gus.ifpe.edu.ppo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import gus.ifpe.edu.ppo.Entity.Login;

public interface LoginDAO extends JpaRepository<Login, Long> {
	
	UserDetails findByApelido(String apelido);

}
