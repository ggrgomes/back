package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.CarteiraDeEstudante;
import gus.ifpe.edu.ppo.Repository.CarteiraDeEstudanteDAO;

@Service
public class CarteiraDeEstudanteService {

	@Autowired
	private CarteiraDeEstudanteDAO dao;
	
	public  CarteiraDeEstudante cadastrarCarteira( CarteiraDeEstudante c) {
		return dao.save(c);
	}
	
	public List< CarteiraDeEstudante> listarCarteiras(){
		return dao.findAll();
	}
	
	public  CarteiraDeEstudante atualizarCarteira( CarteiraDeEstudante c) {
		return dao.save(c);
	}
	
	public void removerCarteira(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<CarteiraDeEstudante> buscarCarteira(Long id) {
		return dao.findById(id);
		
	}
}
