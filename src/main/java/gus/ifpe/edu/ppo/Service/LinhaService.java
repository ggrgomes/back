package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Linha;
import gus.ifpe.edu.ppo.Repository.LinhaDAO;

@Service
public class LinhaService {

	@Autowired
	private LinhaDAO dao;
	
	public Linha cadastrarLinha(Linha l) {
		return dao.save(l);
	}
	
	public List<Linha> listarLinhas(){
		return dao.findAll();
	}
	
	public Linha atualizarLinha(Linha l) {
		return dao.save(l);
	}
	
	public void removerLInha(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Linha> buscarLinha(Long id) {
		return dao.findById(id);
		
	}
}
