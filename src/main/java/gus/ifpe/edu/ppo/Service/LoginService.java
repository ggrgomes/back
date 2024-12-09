package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Login;
import gus.ifpe.edu.ppo.Repository.LoginDAO;

@Service
public class LoginService  {
	
	@Autowired
	private LoginDAO dao;

	public Login cadastrarLogin(Login l) {
		return dao.save(l);
	}
	
	public List<Login> listarLogins(){
		return dao.findAll();
	}
	
	public Login atualizarLogin(Login l) {
		return dao.save(l);
	}
	
	public void removerLogin(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Login> buscarLogin(Long id) {
		return dao.findById(id);
		
	}

	
}
