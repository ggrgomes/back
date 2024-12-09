package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Passe;
import gus.ifpe.edu.ppo.Repository.PasseDAO;

@Service
public class PasseService {

	@Autowired
	private PasseDAO dao;

	
	public Passe cadastrarPasse(Passe p) {
	    
		return dao.save(p);
	}
	
	public List<Passe> listarPasses(){
		return dao.findAll();
	}
	
	public Passe atualizarPasse(Passe p) {
		return dao.save(p);
	}
	
	public void removerPasse(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Passe> buscarPasse(Long id) {
		return dao.findById(id);
		
	}
}
