package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Debito;
import gus.ifpe.edu.ppo.Repository.DebitoDAO;

@Service
public class DebitoService {
	
	@Autowired
	private DebitoDAO dao;
	
	public Debito cadastrarDebito(Debito d) {
		return dao.save(d);
	}
	
	public List<Debito> listarDebitos(){
		return dao.findAll();
	}
	
	public Debito atualizarDebito(Debito d) {
		return dao.save(d);
	}
	
	public void removerDebito(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Debito> buscarDebito(Long id) {
		return dao.findById(id);
		
	}

}
