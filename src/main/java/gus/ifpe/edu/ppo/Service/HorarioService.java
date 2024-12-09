package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Horario;
import gus.ifpe.edu.ppo.Repository.HorarioDAO;

@Service
public class HorarioService {

	@Autowired
	private HorarioDAO dao;
	
	public Horario cadastrarHorario(Horario h) {
		return dao.save(h);
	}
	
	public List<Horario> listarHorarios(){
		return dao.findAll();
	}
	
	public Horario atualizarHorario(Horario h) {
		return dao.save(h);
	}
	
	public void removerHorario(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Horario> buscarHorario(Long id) {
		return dao.findById(id);
		
	}
}
